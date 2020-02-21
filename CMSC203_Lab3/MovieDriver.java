

import java.util.Scanner;

public class MovieDriver {

	static Scanner keyboard = new Scanner(System.in); 								// Task 1
	static Movie myMovie = new Movie(); 											// Task 1
	
	public static void main(String[] args) {
		
		String confirmation;
		do
		{
			System.out.println("Enter a title of a movie"); 							// Task 1
			String title = keyboard.next(); 										// Task 1
			myMovie.setTitle(title); 													// Task 1
		
			System.out.println("Enter a rating of the movie");						 	// Task 1
			String rating = keyboard.next(); 										// Task 1
			myMovie.setRating(rating); 													// Task 1
		
			System.out.println("Enter number of tickets sold at (unamed) theater"); 	// Task 1
			int tickets = keyboard.nextInt(); 											// Task 1
			myMovie.setSoldTickets(tickets); 											// Task 1
			
			System.out.println(myMovie);
			
			System.out.println("Do you want to enter another? ('y' or 'n')");
			confirmation = keyboard.next();
		}
		while(confirmation.equalsIgnoreCase("y"));
	}

}
