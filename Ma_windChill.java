import java.util.Scanner;

public class Ma_windChill {

	public static void main(String[] args) 
	{
		final String PROGRAMMER = "Matthew Ma";
		double temp, windSpeed, windChill;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("This is a Wind Chill Calculator for degrees Fahrenheit and miles per hour.\n");
		
		do
		{
			System.out.println("Enter Temperature in degrees Fahrenheit. May not be above 40.0 or below -45.0");
			temp = keyboard.nextDouble();
			if(temp > 40.0 || temp < -45.0)
				System.out.println("Temperature may not be above 40.0 or below -45.0! Try again.");
		}
		while((temp > 40.0 || temp < -45.0));
		do
		{
			System.out.println("Enter Wind Speed in miles per hour. May not be above 60.0 or below 5.0");
			windSpeed = keyboard.nextDouble();
			if(windSpeed > 60.0 || windSpeed < 5.0)
				System.out.println("Wind Speed may not be above 60.0 or below 5.0! Try again.");
		}
		while(windSpeed > 60.0 || windSpeed < 5.0);
		
		keyboard.close();
		
		windChill = 35.74 + (0.6215 * temp) - (35.75 * (Math.pow(windSpeed, 0.16))) + 
					((0.4275 * temp) * (Math.pow(windSpeed, 0.16)));
		
		/*Wind Chill (F) = 35.74 + 0.6215T - 35.75(V^0.16) + 0.4275T(V^0.16), where
		 *V is the Wind Speed in MPH, and 
		 *T is the temperature in degrees F.
		 */
		
		System.out.println("The Wind Chill for " + temp + " degrees Fahrenheit, at Wind Speed of " + windSpeed + 
							" miles per hour, will be " + windChill);
		System.out.println("\nProgrammer: " + PROGRAMMER);
	}

}
