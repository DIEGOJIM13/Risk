package World;

import java.util.ArrayList;

import Army.*;
import Player.Player;
import Window.CountryButton;

public class Country {
	private Continent continent;
	private Player player;
	private ArrayList<Troop> troops;
	private String name;
	private int xLoc;
	private int yLoc;
	private ArrayList<Country> borderingCountries;
	private CountryButton button;
	
	public Country(String name){
		this.continent = null; // will set this in the addCountry() method
		this.player = null;
		this.troops = new ArrayList<Troop>();
		this.name = name;
		this.xLoc = 0;
		this.yLoc = 0;
		this.borderingCountries = new ArrayList<Country>();
		this.button = null;
	}
	public String toString() {
		String retString = "Country Name: " + this.name + "\n";
		retString += "Player: " + this.player.getName() + "\n";
		retString += "Continent: " + this.continent.getName() + "\n";
		retString += "Bordering Countries: ";
		for(Country c : this.borderingCountries) {
			retString += c.getName() + ", ";
		}
		retString += "Number of troops: " + this.troops.size();
		retString += "\n\n";
		return retString;
	}
	public void setContinent(Continent c){
		continent = c;
	}
	public Continent getContinent(){
		return continent;
	}
	public void setPlayer(Player p){
		player = p;
	}
	public Player getPlayer(){
		return player;
	}
	public void addTroop(Troop t){
		troops.add(t);
	}
	public void addInfrantry(int numTroops) {
		for(int i = 0; i < numTroops; i++) {
			Infantry temp = new Infantry();
			this.troops.add(temp);
		}
	}
	public void removeTroops(int numToRemove){
		for(int i = 0; i < numToRemove; i++) { // removing the troops from the attacking country
			this.troops.remove(this.troops.size() - 1);
		}
	}
	public ArrayList<Troop> getTroops(){
		return troops;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setXLoc(int x){
		xLoc = x;
	}
	public int getXLoc(){
		return xLoc;
	}
	public void setYLoc(int y){
		yLoc = y;
	}
	public int getYLoc(){
		return yLoc;
	}
	public void addBorderingCountry(Country c1){
		this.borderingCountries.add(c1);
		c1.getBorderingCountries().add(this);
	}
	public ArrayList<Country> getBorderingCountries(){
		return borderingCountries;
	}
	public void setButton(CountryButton b) {
		this.button = b;
	}
	public CountryButton getButton() {
		return this.button;
	}
	public boolean checkAdjacent(Country c1){
		return this.borderingCountries.contains(c1);
	}
	public void addTroop(int num){}
}
