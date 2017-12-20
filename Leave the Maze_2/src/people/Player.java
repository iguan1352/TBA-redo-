package people;

public class Player {

	private  int positionX;
	private  int positionY;
	
	public Player(int positionY, int positionX)
	{
		this.positionX = positionX;
		this.positionY = positionY;
	}

	//sets y-coordinate
	public void setX(int x)
	{
		this.positionX = x;
		
	}
	
	//sets x-coordinate
	public void setY(int y)
	{
		this.positionY = y;
		
	}
	
	//gets y-coordinate
	public int getX()
	{
		return positionX;
	}
	
	//gets x-coordinate
	public int getY()
	{
		return positionY;
	}

	//the x and y coordinates are flipped
}
