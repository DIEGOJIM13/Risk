package World;

import java.util.ArrayList;

import Army.Troop;
import Player.Player;

public class Country {
	private Continent continent;
	private Player player;
	private ArrayList<Troop> troops;
	private String name;
	private int xLoc;
	private int yLoc;
	private ArrayList<Country> borderingCountries;
	
	public Country(){
		continent = new Continent();
		player = new Player();
		troops = new ArrayList<Troop>();
		name = "unknown";
		xLoc = 0;
		yLoc = 0;
		borderingCountries = new ArrayList<Country>();
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
	public void removeTroop(Troop t){
		for(Troop A : troops){
			if(A.equals(t)){
				troops.remove(A);
				break;
			}
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
	public void setBorderingCountries(ArrayList<Country> countries){
		borderingCountries = countries;
	}
	public ArrayList<Country> getBorderingCountries(){
		return borderingCountries;
	}
	public void checkAdjacent(Country c1){}
	public void addTroop(int num){}
}
