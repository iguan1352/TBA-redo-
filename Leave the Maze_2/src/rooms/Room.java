package rooms;

public abstract class Room {

	public boolean wall;
	public boolean sinkhole;
	private int x;
	private int y;
	
	public Room(int x, int y, boolean wall, boolean sinkhole) 
	{
		this.x = x;
		this.y = y;
		this.wall = wall;
		this.sinkhole = sinkhole;
	}

	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
	public abstract void print();
	public abstract String roomId();
}
