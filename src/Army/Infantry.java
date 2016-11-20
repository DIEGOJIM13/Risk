package Army;

public class Infantry extends Troop{
	private int strength;
	
	public Infantry() {
		this.strength = 1;  // all infrantry have strength of one
	}

	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	@Override
	public void die() {
		// TODO Auto-generated method stub
		
	}
}
