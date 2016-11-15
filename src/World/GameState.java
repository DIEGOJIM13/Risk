package World;

import Player.*;

public class GameState {
	private Player currPlayer;
	private Group allPlayers;
	private int currPhase; // 0 beggining, 1 attack, 2 move
	private World world;
	
	public GameState() {
		this.currPlayer = null;  // will set this at the beggining of the turn
		this.allPlayers = new Group();
		this.currPhase = 0;
		this.world = new World(); // creating the world
	}
	
	public String toString() {
		return world.toString(); // will have other ones but right now just the string
	}
	
	public void gameStart() { // will start the game setting player 1 as the current player
		this.currPhase = 0;
		this.currPlayer = this.allPlayers.getPlayers().get(0);
		this.world.startGame(this.allPlayers); // will deal out the cards and initialize countries
	}
	
	public Player getCurrPlayer() {
		return this.currPlayer;
	}
	
	public Group getAllPlayers() {
		return this.allPlayers;
	}
	
	public int getCurrPhase() {
		return this.currPhase;
	}
	
	public World getWorld() {
		return this.world;
	}
	
	public void setCurrPlayer(Player p1) {
		this.currPlayer = p1;
	}
	
	public void addPlayer(Player p1) {
		this.allPlayers.addPlayer(p1);
	}
	
}
