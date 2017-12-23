package gameboard;

import people.Player;
import rooms.Room;

public class Board {

	private Room[][] mazeMap;
	
	/*
	 * the game board constructor
	 * @param Room[][] mazeMap
	 */
	public Board(Room[][] mazeMap)
	{
		this.mazeMap = mazeMap;
	}
	
	/*
	 * prints the game board
	 * @param the player of the game
	 */
	public void printMaze(Player player)
	{
		for(int i = 0; i < mazeMap.length; i++) 
        {
            for (int j = 0; j < mazeMap[i].length; j++)
            {
            	if(player.getX() == i && player.getY() == j)
            	{
            		System.out.print("[ U ]");
            	}
            	else
            	{
            		mazeMap[i][j].print(); //the print method is in the Ostacle class
            	}
            }
            System.out.println();
        }
	}
	
	public Room[][] getMazeMap() 
	{
        return mazeMap;
	}
	
	public void setMaze(Room[][] mazeMap)
	{
		this.mazeMap = mazeMap;
	}

}
