package game;

import rooms.Obstacle;
import rooms.Room;

public class Utilities {
	public static int x;
	public static int y;
	
	public static Room randomRoom(int x, int y)
	{
		int r = (int)(Math.random() * 10);
		if((r == 1 || r == 3) || r == 5)
		{
			return new Obstacle(x,y,true,false);
		}
		if(r == 7 || r == 9)
		{
			return new Obstacle(x,y,false,true);
		}
		return new Obstacle(x,y,false,false);
	}
}
