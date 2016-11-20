package Player;

import java.util.ArrayList;
import java.util.Scanner;

import Army.Infantry;
import Army.Troop;
import World.Card;
import World.Country;

public class Player {
	private String name;
	private String color;
	private ArrayList<Troop> numTroops = new ArrayList<Troop>();
	private ArrayList<Country> countries = new ArrayList<Country>();
	private ArrayList<Card> hand = new ArrayList<Card>();
	private Group party;
	
	public Player(String name, String color) {
		this.name = name;
		this.color = color;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
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
	
	public void attack(Country c1, Country c2){}
	public void begTurn() {
		System.out.println(this.getName() + "'s turn. It is the beggining of their turn.");
		System.out.println("You have " + this.getBonus() + " troops to deploy. Please select a country you would like to add the troop to: ");
		Scanner sc = new Scanner(System.in); // just for console testing purposes
		for(int i = 0; i < this.getBonus(); i++) {
			String coString = sc.nextLine();
			
		}
	}
	public void moveTroops(Country c1, Country c2, int toMove) {}
	public void endTurn() {
		System.out.println(this.getName() + "'s turn. It is the end of their turn.");				
	}
	public void midTurn() {
		System.out.println(this.getName() + "'s turn. It is the middle of their turn.");		
	}
	public void drawCard(){}
	public void redeemCard(){}
	public void defend(){}
	public void lose(){}
	public int roll(){
		return 0;}
	public int getBonus() {
		return Math.floorDiv(this.countries.size(), 3);
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
}
