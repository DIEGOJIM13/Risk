package World;

import java.util.ArrayList;

import Player.Player;

public class Continent {
	private ArrayList<Country> countries;
	private int bonus;
	private String color;
	private String name;
	private World world;
	
	public Continent(){
		countries = new ArrayList<Country>();
		bonus = 0;
		color = "unknown";
		name = "unkown";
		world = new World();
	}
	public void addCountry(Country c){
		countries.add(c);
	}
	public void removeCountry(Country c){
		for(Country A : countries){
			if(A.equals(c)){
				countries.remove(A);
				break;
			}
		}
	}
	public ArrayList<Country> getCountries(){
		return countries;
	}
	public void setBonus(int bonus){
		this.bonus = bonus;
	}
	public int getBonus(){
		return bonus;
	}
	public void setColor(String col){
		color = col;
	}
	public String getColor(){
		return color;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setWorld(World w){
		world = w;
	}
	public World getWorld(){
		return world;
	}
	public Player checkIfRuled(){
		Player placeHolder = new Player();
		return placeHolder;
	}
}
