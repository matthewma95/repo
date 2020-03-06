import java.util.Random;
import java.util.Scanner;

/**  	CMSC203 Assignment 2 Spring 2020 
 * A Birthday driver class for the Toy class.
 * 
 * @author Matthew Ma
 */

public class Birthday {

	public static void main(String[] args) 
	{
		Random number = new Random();
		Scanner keyboard = new Scanner(System.in);
		String name, choice, cont, choiceTwo, anotherToy;
		int age = 0, orderNumber = number.nextInt(99999);
		double totalCost = 0.0;
		
		do
		{
			System.out.println("What is the name of the child?");
			name = keyboard.next();
		
			System.out.println("What is the age of the child?");
			age = keyboard.nextInt();
			
			System.out.println("What is the choice of toy for the child? (plushie/blocks/book)");
			choice = keyboard.next();
			
			Toy newToy = new Toy(choice, age);
			
			while(newToy.ageOK() == false) 
			{
				System.out.println("Toy is not age appropriate! Buy another toy? (y/n)");
				anotherToy = keyboard.next();
				if(anotherToy.equalsIgnoreCase("y"))
				{
					System.out.println("What is the choice of toy for the child? (plushie/blocks/book)");
					choice = keyboard.next();
					newToy = new Toy(choice, age);
				}
				else
					break;
			}
			
			System.out.println("Add a card or balloon? (card/balloon/n)");
			choiceTwo = keyboard.next();
			if(choiceTwo.equalsIgnoreCase("card"))
				newToy.addCard("yes");
			else if(choiceTwo.equalsIgnoreCase("balloon"))
				newToy.addBalloon("yes");
			
			System.out.println("Childs name: " + name + "\nChild's Age: " + age + "\nToy Choice: " + choice + "\nTotal Cost: $" + newToy.getCost());
			
			totalCost += newToy.getCost();
			
			System.out.println("Enter another child? (y/n)");
			cont = keyboard.next();
			
		}
		while(cont.equalsIgnoreCase("y"));
		
		keyboard.close();
		System.out.println("Order Cost: $" + totalCost + "\nOrder Number: " + orderNumber);
	}
}
