package World;
import Player.Player;
public class Card {
	private Country country;
	private int numStars;
	private Player player;
	
	public Card(){
		country = new Country();
		numStars = 0;
		player = new Player();
	}
	public void setCountry(Country c){
		country = c;
	}
	public Country getCountry(){
		return country;
	}
	public void setNumStars(int stars){
		numStars = stars;
	}
	public int getNumStars(){
		return numStars;
	}
	public void setPlayer(Player p){
		player = p;
	}
	public Player getPlayer(){
		return player;
	}
}
