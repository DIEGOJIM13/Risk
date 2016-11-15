import Player.*;
import World.*;

public class driver {

	public static void main(String[] args) {
		GameState state = new GameState(); // creating the game (basically the game without the GUI)
		Player p1 = new Player("Eddie", "Blue"); // creating the players playing
		Player p2 = new Player("Hugo", "Green");
		Player p3 = new Player("Diego", "Red");
		state.addPlayer(p1); // adding the players to the game
		state.addPlayer(p2);
		state.addPlayer(p3);
		state.gameStart(); // starting the game which gives the countries to the users
		System.out.println(state); // printing everything about the game

	}

}
