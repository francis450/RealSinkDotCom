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
		}

}