package Player;

import java.util.ArrayList;

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
	
	public void getTroops(int bonus){}
	public void attack(Country c1, Country c2){}
	public void begTurn() {}
	public void moveTroops(Country c1, Country c2, int toMove) {}
	public void endTurn(){}
	public void midTurn(){}
	public void drawCard(){}
	public void redeemCard(){}
	public void defend(){}
	public void lose(){}
	public int roll(){
		return 0;}
	public int getBonus(){
		return 0;}
	
	
	
	
	
}
