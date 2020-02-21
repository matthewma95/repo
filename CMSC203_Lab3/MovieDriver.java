

import java.util.Scanner;

public class MovieDriver {

	static Scanner keyboard = new Scanner(System.in); 						// Task 1
	static Movie myMovie = new Movie(); 								// Task 1
	
	public static void main(String[] args) {
		
		String confirmation;
		do											// Task 2
		{
			System.out.println("Enter a title of a movie"); 				// Task 1
			String title = keyboard.next(); 						// Task 1
			myMovie.setTitle(title); 							// Task 1
		
			System.out.println("Enter a rating of the movie");				// Task 1
			String rating = keyboard.next(); 						// Task 1
			myMovie.setRating(rating); 							// Task 1
		
			System.out.println("Enter number of tickets sold at (unamed) theater"); 	// Task 1
			int tickets = keyboard.nextInt(); 						// Task 1
			myMovie.setSoldTickets(tickets); 						// Task 1
			
			System.out.println(myMovie);							// Task 1
			
			System.out.println("Do you want to enter another? ('y' or 'n')"); 		// Task 2
			confirmation = keyboard.next();							// Task 2
		}
		while(confirmation.equalsIgnoreCase("y"));						// Task 2
	}

}
