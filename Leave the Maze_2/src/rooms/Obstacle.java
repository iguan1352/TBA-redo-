package rooms;

public class Obstacle extends Room {
	
	public Obstacle(int x, int y, boolean wall, boolean sinkhole) 
	{
		super(x, y, wall, sinkhole);
	}

	public void print()
	{
		/*if(this.wall)
		{
			System.out.print("[ W ]");
			System.out.println("This is a wall, you have to walk away from it." );
		}
		else if(this.sinkhole)
		{
			System.out.print("[ O ]");
		}
		else
		{
			System.out.print("[   ]");
		}*/
		if(roomId().equals("w"))
		{
			System.out.print("[ W ]");
			System.out.println("This is a wall, you have to walk away from it." );
		}
		else if(roomId().equals("o"))
		{
			System.out.print("[ O ]");
			System.out.println("This is a sinkhole, careful don't fall in." );
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
