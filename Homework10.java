package homeworkChapter4;

import java.util.Scanner;

public class Homework10 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("please, enter a number between 1 and 20");

		int x = input.nextInt();
		int counter = 0;

		if (x < 21) {

			while (counter < (x * x)) {
				System.out.print("*");
				counter++;

				if (counter % x == 0)
					System.out.println();
			}
		} else
			System.out.print("you enter wrong number");
	}
}


//4.29	(Square of Asterisks) Write an application that prompts the user to enter the size of the side
//of a square, then displays a hollow square of that size made of asterisks. Your program should work
//for squares of all side lengths between 1 and 20.
