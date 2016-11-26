import java.awt.Color;

import Player.*;
import World.*;

public class driver {

	public static void main(String[] args) {
		/*
		 * This driver should emulate the flow the game through a console. It creates the players, initializes the world,
		 * and goes through the whole process of a turn. These turns continue until everyone quits but one player, or the world has been conquered.
		 */
		GameState state = new GameState(); // creating the game (basically the game without the GUI)
		Player p1 = new Player("Eddie", Color.BLUE); // creating the players playing
		Player p2 = new Player("Hugo", Color.GREEN);
		Player p3 = new Player("Diego", Color.RED);
		state.addPlayer(p1); // adding the players to the game
		state.addPlayer(p2);
		state.addPlayer(p3);
		state.gameStart(); // starting the game which gives the countries to the users
		System.out.println(state); // printing everything about the game
		while(state.checkWinner() == null) {
			for(Player p: state.getAllPlayers().getPlayers()) { // going through a players whole turn
				p.begTurn();
				p.midTurn();
				p.endTurn();
				System.out.println(state); // printing the world after everyone's turn
			}
		}
		System.out.println("Congrats to " + state.checkWinner().getName() + " for winning the game! xd");
	}

}
