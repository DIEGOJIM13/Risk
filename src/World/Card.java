package World;
import Player.Player;
public class Card {
	private Country country;
	private int numStars;
	private Player player;
	
	public Card(Country country, int numStars){
		this.country = country;
		this.numStars = numStars;
		player = null;
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
