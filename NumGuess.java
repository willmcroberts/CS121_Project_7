// NumGuess.java
import java.util.*;

public class NumGuess {
	public static void main(String[] args) {
		boolean keepGoing = true;

		while(keepGoing) {
			String choice = menu();
			
			if (choice.equals("0")) {
				keepGoing = false;
			} else if (choice.equals("1")) {
				humanGuesser();
			} else if (choice.equals("2")) {
				computerGuesser();
			} else {
				System.out.println("Invalid Input");
				System.out.println("");
			} // End elif statement
		} // End while loop
	} // End main

	public static String menu() {
		System.out.println("0) Quit");
		System.out.println("1) Human Guesser");
		System.out.println("2) Computer Guesser");

		Scanner input = new Scanner(System.in);
		System.out.print("Enter choice: ");
		return input.nextLine();
	} // End menu()

	public static void humanGuesser() {
		Random random = new Random();
		Scanner input = new Scanner(System.in);
		int correct = random.nextInt(100);
		System.out.println(correct);

		boolean keepGoing = true;
		int i = 0;
		int guess;

		while (keepGoing) {
			i++;
			System.out.println("");
			System.out.print("Guess " + i + ") Please enter your guess (0-99): ");
			guess = input.nextInt();

			if (guess > correct) {
				System.out.println("Too High");
			} else if (guess < correct) {
				System.out.println("Too Low");
			} else {
				System.out.println("Correct, nice job!!!");
				System.out.println("");
				keepGoing = false;
			} // End elif statement
		} // End while loop
	} // End humanGuesser

	public static void computerGuesser() {
		Scanner input = new Scanner(System.in);
		int max = 100;
		int min = 0;
		int guess;
		boolean keepGoing = true;
		int i = 0;

		while (keepGoing) {
			guess = (int) ((max + min) / 2);
			i++;
			System.out.println("");
			System.out.println("Geuess " + i + ") I Guess " + guess);
			boolean keepGoing2 = true;
				
			while (keepGoing2) {
				System.out.println("Too (H)igh, Too (L)ow, (C)orrect: ");
				String answer = input.nextLine();
				answer = answer.toLowerCase();

				if (answer.equals("h")) {
					max = guess;
					keepGoing2 = false;
				} else if (answer.equals("l")) {
					min = guess;
					keepGoing2 = false;
				} else if (answer.equals("c")) {
					System.out.println("Computer won!!!");
					System.out.println("");
					keepGoing2 = false;
					keepGoing = false;
				} else {
					System.out.println("Invalid input");
				} // End elif statements
			} // End nested while loop		
		} // End while loop
	} // End computerGuesser()
} // End class
