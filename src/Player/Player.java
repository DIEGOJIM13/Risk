package Player;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Army.Infantry;
import Army.Troop;
import World.Card;
import World.Continent;
import World.Country;
import World.World;

public class Player {
	private String name;
	private Color color;
	private ArrayList<Troop> numTroops = new ArrayList<Troop>();
	private ArrayList<Country> countries = new ArrayList<Country>();
	private ArrayList<Card> hand = new ArrayList<Card>();
	private Group party;
	private JFormattedTextField playerTextName;
	private static Scanner sc = new Scanner(System.in);
	
	public Player(String name, Color color) {
		this.name = name;
		this.color = color;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public ArrayList<Troop> getNumTroops() {
		return numTroops;
	}
	public void setNumTroops(ArrayList<Troop> numTroops) {
		this.numTroops = numTroops;
	}
	public ArrayList<Country> getCountries() {
		return countries;
	}
	public void setCountries(ArrayList<Country> countries) {
		this.countries = countries;
	}
	public ArrayList<Card> getHand() {
		return hand;
	}
	public void setHand(ArrayList<Card> hand) {
		this.hand = hand;
	}
	public Group getParty() {
		return party;
	}
	public void setParty(Group party) {
		this.party = party;
	}
	public Country checkIfOwned(String countryName) {
		for(Country c : this.countries) {
			if (c.getName().equals(countryName)) {
				return c;
			}
		}
		
		return null;
	}
	public Country checkIfCanAttack(Country origin, String countryName) {
		
		if( (this.checkIfOwned(countryName) != null) || (origin.getTroops().size() == 1) ) { // will return null if the player already owns the country or if there is only one troop
			return null;
		}
		
		for(Country c1 : origin.getBorderingCountries()) { // checking to see if the country is bordering the country
			if (c1.getName().equals(countryName)) {
				return c1;
			}
		}
		
		return null;
	}
	
	public Country checkIfCanMove(Country origin, String countryName) {
		if( (this.checkIfOwned(countryName) == null) || (origin.getTroops().size() == 1) ) { // will return null if the player already owns the country or if there is only one troop
			return null;
		}
		
		for(Country c1 : origin.getBorderingCountries()) { // checking to see if the country is bordering the country
			if (c1.getName().equals(countryName)) {
				return c1;
			}
		}
		
		return null;
	}
	
	public void attack(Country c1, Country c2) {
		Random rand = new Random(); // so we can create random numbers to simulate rolling (omg I am such a raver)
		ArrayList<Integer> attackRoll = new ArrayList<Integer>(); // will contain all of the attacker's rolls
		ArrayList<Integer> defendRoll = new ArrayList<Integer>(); // will contain all of the defender's roll

		for(int i = 0; i < Math.min(c1.getTroops().size() - 1, 3); i++) { // populating the attacker's rolls
			if(c1.getPlayer().getName().equals("Sam")){
				Integer tempInt = new Integer(rand.nextInt(4) + 1);
				attackRoll.add(tempInt);
			}
			else{
				Integer tempInt = new Integer(rand.nextInt(6) + 1);
				attackRoll.add(tempInt);
			}
		}
		for(int i = 0; i < Math.min(c2.getTroops().size(), 2); i++) { // populating the defender's rolls
			if(c2.getPlayer().getName().equals("Sam")){
				Integer tempInt = new Integer(rand.nextInt(4) + 1);
				defendRoll.add(tempInt);
			}
			else{
				Integer tempInt = new Integer(rand.nextInt(6) + 1);
				defendRoll.add(tempInt);
			}
		}
		String diceString = "Attacker rolled:\n";
		for(int i = 0; i < attackRoll.size(); i++) {
			if(i !=  Math.min(c1.getTroops().size(), 3) - 1) {
				diceString += attackRoll.get(i) + ", ";
			}
			else {
				diceString += attackRoll.get(i);
			}
		}
		diceString += "\nDefender rolled:\n";
		for(int i = 0; i < defendRoll.size(); i++) {
			if(i != Math.min(c2.getTroops().size(), 2) - 1) {
				diceString += defendRoll.get(i) + ", ";				
			}
			else {
				diceString += defendRoll.get(i) + "\n";
			}
		}
		JOptionPane.showMessageDialog(null, diceString);

		while(!defendRoll.isEmpty() && !attackRoll.isEmpty()) { // comparing the rolls
			if(Collections.max(attackRoll) > Collections.max(defendRoll)) { // if attacker won
				c2.getPlayer().getNumTroops().remove(c2.getPlayer().getNumTroops().size() - 1); // remove one troop from defending player
				c2.getTroops().remove(c2.getTroops().size() - 1); // remove one troop from defending country
			}
			else { // if defender won
				this.numTroops.remove(this.numTroops.size() - 1); // remove one troop from attacking player
				c1.getTroops().remove(c1.getTroops().size() - 1); // remove one troop from defending player
			}
			attackRoll.remove((Integer)Collections.max(attackRoll)); //removing highest roll of attacker
			defendRoll.remove((Integer)Collections.max(defendRoll)); // removing highest roll of defender
		}
		
		if(c2.getTroops().size() == 0) { // if the defending country was taken over
			c2.getPlayer().removeCountry(c2);
			c2.setPlayer(this);
			this.addCountry(c2);
			
			int moveNum = 0;
			JPanel numPanel = new JPanel();
			numPanel.add(new JLabel("Congrats you conquered " + c2.getName() + " with " + c1.getName() + ". How many troops would you like to add?"));
			DefaultComboBoxModel<String> selection = new DefaultComboBoxModel<String>();
			for (int i = 1; i < c1.getTroops().size(); i++){
				selection.addElement(Integer.toString(i));
			}
			JComboBox<String> comboBox = new JComboBox<String>(selection);
			numPanel.add(comboBox);
			int result = JOptionPane.showConfirmDialog(null, numPanel, "Number of Troops", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
			if(result == JOptionPane.CANCEL_OPTION) {
				moveNum = 1; // if they cancel it will just move one
			}
			else {
				moveNum = Integer.parseInt(comboBox.getSelectedItem().toString());
			}
			moveNum = Integer.parseInt(comboBox.getSelectedItem().toString());
			c2.addInfrantry(moveNum); // adding the troops to the conquered country
			c1.removeTroops(moveNum); // removing troops from the origin country
		}
	}
	public void begTurn() {
		System.out.println(this.getName() + "'s turn. It is the beggining of their turn.");
		System.out.println("You have " + this.getBonus() + " troops to deploy.");
		this.addInfrantry(this.getBonus()); // adding the infantry to the player
		for(int i = 0; i < this.getBonus(); i++) {
			System.out.println("Please select a country that you want to add an infantry to.");
			String coString = sc.nextLine();
			Country tempCountry = this.checkIfOwned(coString);
			if(tempCountry != null) {
				tempCountry.addInfrantry(1);
			}
			else {
				System.out.println("Error: User doens't have the country or country doesn't exist");
				i--;
			}
		}
	}
	public void removeTroops(int numToRemove) {
		for(int i = 0; i < numToRemove; i++) {
			this.numTroops.remove(this.numTroops.size() - 1);
		}
	}
	public void moveTroops(Country c1, Country c2, int toMove) {
		c1.removeTroops(toMove);
		c2.addInfrantry(toMove);
	}
	public void endTurn() {
		System.out.println(this.getName() + "'s turn. It is the end of their turn.");
		Country origin = null;
		Country destination = null;
		int moveNum = 0;
		System.out.println("Do you want to move troops?");
		String Answer = sc.nextLine();
		while(Answer.equals("Yes") | Answer.equals("yes")) {
			do {
				System.out.println("Please select a country that you would like to move from.");
				String coString = sc.nextLine();
				origin = this.checkIfOwned(coString);
			} while (origin == null);
	
			do {
				System.out.println("Please select a country that you would like to move to.");
				String coString = sc.nextLine();
				destination = this.checkIfCanMove(origin, coString);
			} while (destination == null);
			do {
				System.out.println("Please select the number of troops you would like to move.");
				moveNum = sc.nextInt();
			} while (moveNum > origin.getTroops().size());
			
			this.moveTroops(origin, destination, moveNum);
			System.out.println("Do you want to move more troops?");
			Answer = sc.nextLine();
		}
	}
	public void midTurn() {
		System.out.println(this.getName() + "'s turn. It is the middle of their turn.");
		Country origin = null;
		Country destination = null;
		System.out.println("Do you want to attack?");
		String Answer = sc.nextLine();
		while(Answer.equals("Yes") | Answer.equals("yes")) {
			do {
				System.out.println("Please select a country that you would like to attack with.");
				String coString = sc.nextLine();
				origin = this.checkIfOwned(coString);
			} while (origin == null);
	
			do {
				System.out.println("Please select a country that you would like to attack.");
				String coString = sc.nextLine();
				destination = this.checkIfCanAttack(origin, coString);
			} while (destination == null);
			this.attack(origin, destination);
			System.out.println("Do you want to attack again?");
			Answer = sc.nextLine();
		}
		
	}
	public void drawCard(){}
	public void redeemCard(){}
	public void defend(){}
	public void lose(){}
	public int roll(){
		return 0;}
	
	public int getBonus() {
		int reward = this.getCountries().size()/3;
		boolean owned = true;
		World world = this.countries.get(0).getContinent().getWorld();
		
		for(Continent con : this.countries.get(0).getContinent().getWorld().getContinents()) {
			owned = true;
			for(Country cou : con.getCountries()) {
				if(!(cou.getPlayer().equals(this))) {
					owned = false;
					//break;
				}
				System.out.println(cou.getPlayer().getName());
				System.out.println(this.name);
			}
			System.out.println(con.getName());
			if(owned) {
				reward += con.getBonus();
			}
		}

		System.out.println("reward " + reward);
		System.out.println("size " + this.countries.size());
		return reward;
	}
	public void addInfrantry(int numTroops) {
		for(int i = 0; i < numTroops; i++) {
			Infantry temp = new Infantry();
			this.numTroops.add(temp);
		}
	}

	public void addCountry(Country c) {
		this.countries.add(c);
	}
	
	public void removeCountry(Country c){
		this.countries.remove(c);
	}

	public JFormattedTextField getPlayerTextName() {
		return playerTextName;
	}

	public void setPlayerTextName(JFormattedTextField playerTextName) {
		this.playerTextName = playerTextName;
	}
}
