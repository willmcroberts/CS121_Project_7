// NumGuess.java
import java.util.*


public class NumGuess {
	public static void main(String[] args) {
		boolean keepGoing = true;

		while(keepGoing) {
			String choice = menu();
			
			if (choice.equals("0") {
				keepGoing = false
			} else if (choice.equals("1") {
				humanGuesser();
			} else if (choice.equals("2") {
				computerGuesser();
			} else {
				System.out.println("Invalid Input");
				keepGoing = true;
			} // End elif statement
		} // End while loop
	} // End main

	public String menu() {
		System.out.println("0) Quit");
		System.out.println("1) Human Guesser");
		System.out.println("2) Computer Guesser");

	} // End menu()
} // End class
