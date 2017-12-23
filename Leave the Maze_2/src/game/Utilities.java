package game;

public class Utilities {
	public static int x;
	public static int y;
	
	/*
	 * randomBoolean chooses true or false randomly and 
	 * there will be a higher chance in generating a false rather than true
	 */
	public static boolean randomBoolean()
	{
		int r = (int)(Math.random() * 3) +1;
		if(r == 2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
