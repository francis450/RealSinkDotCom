//import the java utilities package
import java.util.*;
//import input and output streams
import java.io.*;

public class DotComBust{
	
		//Declare and instantiate the GameHelper instance variable named helper
		private GameHelper helper = new GameHelper();
		//make an Arraylist of Dot coms 
		ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
		//define an int variable to keep track of number of user guesses
		int numOfGuesses  =  0;

		//A method to set up the initial game specs
		private void setUpGame(){
			//make three DotCom objects and name them
			DotCom one = new DotCom();
			one.setName("Cats.com");
			DotCom two = new DotCom();
			two.setName("Dogs.com");
			DotCom three = new DotCom();
			three.setName("mice.com");

			//Add the three DotComs into the arrayList
			dotComsList.add(one);
			dotComsList.add(two);
			dotComsList.add(three);

			//give user some instructions on how to play the game
			System.out.println("Your goal is to sink three dot coms using the least number fo guesses.");
			System.out.println("1. "+one.getName()+"\n2. "+two.getName()+"\n3. "+three.getName());

			//for all the Dot Coms in the ArrayList do this..
			for(DotCom four : dotComsList){
				//Declare an ArrayList of String to hold the location of each of the DotCom objects generated by the helper
				ArrayList<String> newLocation = helper.placeDotCom(3);
				//Set the location generated above to each DotCom
				four.setLocationCells(newLocation);
			}
		}

		//When invked it starts up the game
		private void StartPlaying(){
			//repeat while the DotCom Arraylist is not empty
			while(!dotComsList.isEmpty()){
				//Declare a String to hold user input from the helper getUSerInput()
				String userGuess = helper.getUserInput("Enter a guess: ");
				//Check user Guess for a kill/hit/miss
				checkUserGuess(userGuess);
			}
			//When the DotCom ArrayList is empty display number of guesses and a rating
			finishGame();
		}

		//A method to check if the user guesses are correct
		private void checkUserGuess(String 	userGuess){
			//Increment the number fo guesses
			numOfGuesses++;
			//Declare a String to hold the results of a userGuess when checked and initialise it to mmiss
			String result = "miss";
			//Repeat with each DotCom in the ArrayList 
			for(DotCom four : dotComsList){
				//store the return value from the objects checkYourself() in result and force out of the loop
				result = four.checkYourself(userGuess);

				if(result.equals("hit")){
					//If the user guess was a hit get out of the loop
					break;
				}
				//if the result is kill remove the DotCom from the ArrayList and force out of the loop
				if(result.equals("kill")){
					dotComsList.remove(four);
					break;
				}
			}
			//Print out the result
			System.out.println(result);
		}

		//A method to complete the game
		private void finishGame(){
			//Display a generic game over message 
			System.out.println("Woah! I never thought you would get here. :(");
			//For less than twice the number of cells print a congratulation message
			if(numOfGuesses <= 18){
				System.out.println("Good Job!!!\nIt only took you "+numOfGuesses+" guesses to kill all the evil DotComs");
			}else{
				System.out.println("Heyyoh! It took you too long."+ numOfGuesses+" guesses is too long mehn!");
			}
		}

		//Main method to start up the program
		public static void main(String [] args){
			//instantiate a game object
			DotComBust game = new DotComBust();
			//Using the game object invoke the setUpGame() method to start the game
			game.setUpGame();
			//Start the main gameplay loop(keep asking for user guesses until all DotComs are dead)
			game.StartPlaying();
		}
}