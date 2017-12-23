package rooms;

public class Obstacle extends Room {
	public static int count;
	
	public Obstacle(int x, int y, boolean wall, boolean sinkhole) 
	{
		super(x, y, wall, sinkhole);
	}

	/*
	 * prints each room according to its room type
	 */
	public void print()
	{
		if(roomId().equals("w"))
		{
			System.out.print("[ W ]");
			count++;
		}
		else if(roomId().equals("o"))
		{
			System.out.print("[ O ]");
			count++;
		}
		else
		{
			System.out.print("[   ]");
		}
	}

	@Override
	public String roomId() {
		if(this.wall)
		{
			return "w";
		}
		else if(this.sinkhole)
		{
			return "o";
		}
		return "";
	}
}
