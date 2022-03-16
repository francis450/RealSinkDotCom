import java.util.*;

public class DotCom{
	//A string to hold the name of the Dot Com
	private String name;
	
	//An arrayList to hold location of the cells where the DotCOm resides
	private ArrayList<String> locationCells;
	
	//A setter for the name Instance variable
	public void setName(String jina){
		name = jina;
	}

	//A getter method to get the name of the DotCom
	public String getName(){
		return name;
	}

	//A function to verify the user guess(Correct or not)
	public String checkYourself(String userInput){
		//A string variable to track the results of user input
		String result = "miss";

		//Get the index of the cell the user guessed
		int index = locationCells.indexOf(userInput);

		//If it exists consider the following instructions
		if(index >= 0){
			//Remove the cell from the location ArrayList
			locationCells.remove(index);

			//Check if the ArrayList has anything left in it
			if(locationCells.isEmpty()){
				//The locations arrayList is empty which means the DotCom is dead
				//The result is therefore a kill  
				result = "kill";
				//Display a Dead DotCom object
				System.out.println("Congratulations!!! You sank the "+ name);
			}else{
				//This is when the ArrayList is not empty thet means the location ArrayList has some cells left
				//Result then is a hit meaning we have a number of cells left to sink the DotCom
				result = "hit";
			}
		}
		//Return the result of the user guess checkYourself()
		return result;
	}
}