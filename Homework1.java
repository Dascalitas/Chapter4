package homeworkChapter4;

import java.util.Scanner;

public class Homework1 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int gas1 = 0;
		int miles1 = 0;
		int gradeCounter = 1;

		System.out.print("Enter gallons of fuel you use or -1 to quit: ");
		int gas = input.nextInt();
		System.out.print("Enter miles you driven: ");
		int miles = input.nextInt();

		while (gas > 0) {
			double mpg = (double) gas / miles;

			gas1 = gas1 + gas;
			miles1 = miles1 + miles;
			gradeCounter = gradeCounter + 1;
			System.out.printf("you use %d galons of fuel; \nyou drived %d miles; \nyour car use %.2f galons per mile\n",
					gas, miles, mpg);

			System.out.println("Enter gas you use or -1 to quit: ");
			gas = input.nextInt();
			System.out.println("Enter miles you driven: ");
			miles = input.nextInt();
			System.out.print(gradeCounter);
		}

		if (gradeCounter != 0) {
			double gasAverage = (double) gas1 / gradeCounter;
			double milesAverage = (double) miles1 / gradeCounter;
			double gpsAverage = gasAverage / milesAverage;

			System.out.printf("In total you use %d fuel; you drived %d miles;\n", gas1, miles1);
			System.out.printf("in medium, you you use %.3f%n galons per mile", gpsAverage);
		} else
			System.out.println("No grades were entered");
	}
}

//4.17	(Gas Mileage) Drivers are concerned with the mileage their automobiles get. One driver has
//kept track of several trips by recording the miles driven and gallons used for each tankful. Develop
//a Java application that will input the miles driven and gallons used (both as integers) for each trip.
//The program should calculate and display the miles per gallon obtained for each trip and print the
//combined miles per gallon obtained for all trips up to this point. All averaging calculations should
//produce floating-point results. Use class Scanner and sentinel-controlled repetition to obtain the
//data from the user.