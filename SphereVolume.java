import java.util.Scanner;

public class SphereVolume 
{ 
	public static void main(String[] args) 
	{ 	
		// add your declaration and code here
		Scanner keyboard = new Scanner(System.in);
		
		double diam, radi, vol;
		
		System.out.println("The purpose of this program is to calculate the result of a mathematical formula.");
		System.out.println("Enter the diameter of a sphere.");
		
		diam = keyboard.nextDouble();
		radi = diam / 2;
		vol = ((4/3) * Math.PI * Math.pow(radi, 3));
		
		System.out.printf("The volume for a sphere with a diameter of %.2f is %.2f%n", diam, vol);
	}

} 
