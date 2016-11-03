package Army;

import Player.Player;
import World.Country;

public abstract class Troop {
	protected Player player;
	protected String color;
	protected Country country;
	
	public abstract void die();
}
