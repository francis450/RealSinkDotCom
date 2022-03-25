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

			}
		}

}