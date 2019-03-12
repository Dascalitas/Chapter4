package homeworkChapter4;

import java.util.Scanner;

public class Homework13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("enter the first side of triangle:");
		int x = input.nextInt();
		System.out.println("enter the second side of triangle:");
		int y = input.nextInt();
		System.out.println("enter the third side of triangle:");
		int z = input.nextInt();

		if (x > 0 & y > 0 & z > 0) {
			if (x < y + z & y < x + z & z < x + y)
				System.out.println("that can be the sides of one triangle.");
			else
				System.out.println("it's impossible to construct the triangle with that sides.");
		}

		else
			System.out.println("please enter nonzero positive values ");

	}

}


//4.35	(Sides of a Triangle) Write an application that reads three nonzero values entered by the
//user and determines and prints whether they could represent the sides of a triangle.