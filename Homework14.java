package homeworkChapter4;

import java.util.Scanner;

public class Homework14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("enter the first side of triangle:");
		int x = input.nextInt();
		System.out.println("enter the second side of triangle:");
		int y = input.nextInt();
		System.out.println("enter the third side of triangle:");
		int z = input.nextInt();

		if (x > 0 && y > 0 && z > 0) {
			if (Math.pow(x, 2) + Math.pow(y, 2) == Math.pow(z, 2))
				System.out.println("that can be the sides of one right triangle.");

			else if (Math.pow(x, 2) + Math.pow(z, 2) == Math.pow(y, 2))
				System.out.println("that can be the sides of one right triangle.");

			else if (Math.pow(y, 2) + Math.pow(z, 2) == Math.pow(x, 2))
				System.out.println("that can be the sides of one right triangle.");

			else
				System.out.println("it's impossible to construct the right triangle with that sides.");
		}

		else
			System.out.println("please enter nonzero positive values ");
	}

}


//4.36	(Sides of a Right Triangle) Write an application that reads three nonzero integers and determines and prints 
//whether they could represent the sides of a right triangle.