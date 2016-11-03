package Player;

import java.util.ArrayList;

import World.World;

public class Group {
	private ArrayList<Player> players = new ArrayList<Player>();
	private World world;
	private ArrayList<Player> place = new ArrayList<Player>();
	private String groupName;
	
	public ArrayList<Player> getPlayers() {
		return players;
	}
	public void setPlayers(ArrayList<Player> players) {
		this.players = players;
	}
	public World getWorld() {
		return world;
	}
	public void setWorld(World world) {
		this.world = world;
	}
	public ArrayList<Player> getPlace() {
		return place;
	}
	public void setPlace(ArrayList<Player> place) {
		this.place = place;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	
	public void assignName(String name){
		groupName = name;
	}
	
	
}
