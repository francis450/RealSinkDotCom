//Import java utilities package
import java.util.*;
//import java input and output streams
import java.io.*;
public class GameHelper{
	//Make a string to hold the alphabetical notation of the columns in the grid
	private static final String alphabet = "abcdefg";
	//Make an int to define the length of the vitual grid
	private int gridLength = 7;
	//Make an int variable to define the size of the grid
	private int gridSize = 49;
	//Make an int array to hold all the cells in the grid
	private int [] grid = new int [gridSize];
	//Make an int variable to keep track of the number of Dot Coms in the grid
	private int comCount = 0;

	//A method to help prompt for user input and hold it
	public String getUserInput(String prompt){
		//String variable to hold user input
		String inputLine = null;
		//Prompt the user for input
		System.out.print(prompt+" ");
		//Initialize a scanner object to enable input handling		
		Scanner is = new Scanner(System.in);
		//Assign the user input to the inputLine variable
		inputLine = is.nextLine();
		//return the user input in lowercase form
		return inputLine.toLowerCase();
	}

	//An ArrayList method to place Dot Coms in the grid
	public ArrayList<String> placeDotCom(int comSize){
		//An arrayList to hold 'f6' type coords
		ArrayList<String> alphaCells = new ArrayList<String>();
		//make a temporary string for concatenation
		String temp =  null;
		//Make an array to hold current candidate coords
		int [] coords = new int [comSize];
		//Make an int to keep track of current number of attempts
		int attempts = 0;
		//Make a Boolean flag to show us whether we found a good location
		boolean success = false;

		//current starting location
		int location = 0;

		//nth Dot Com to place
		comCount++;
		//Set horizontal increment
		int incr = 1;
		//IF DotCom is odd
		if((comCount % 2) == 1){
			//set vertical increment
			incr = gridLength;
		}

	}
}