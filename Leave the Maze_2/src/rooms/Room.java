package rooms;

public class Room {

	public boolean wall;
	private int x;
	private int y;
	
	public Room(int x, int y) 
	{
		this.x = x;
		this.y = y;
		this.wall = false;
	}

	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
	public void print()
	{
		System.out.print("[   ]");
	}

}
