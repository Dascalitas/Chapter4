package homeworkChapter4;

import java.util.Scanner;

public class Homework12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please, enter the binar number - ");
		int x = input.nextInt();

		if (x < 100000) {

			int a = x / 10000;
			int b = (x / 1000) % 10;
			int c = (x / 100) % 10;
			int d = (x % 100) / 10;
			int e = x % 10;

			if (a < 2 && b < 2 && c < 2 && d < 2 && e < 2) {
				double y = a * Math.pow(2, 4) + b * Math.pow(2, 3) + c * Math.pow(2, 2) + d * Math.pow(2, 1)
						+ e * Math.pow(2, 0);

				System.out.println("the decimal nmber is " + y);
			}

			else
				System.out.print("please enter only binar number");

		} else
			System.out.println("please enter only five digit number");

	}

}


//4.31	(Printing the Decimal Equivalent of a Binary Number) Write an application that inputs an
//integer containing only 0s and 1s (i.e., a binary integer) and prints its decimal equivalent. [Hint: Use
//the remainder and division operators to pick off the binary number’s digits one at a time, from right
//to left. In the decimal number system, the rightmost digit has a positional value of 1 and the next
//digit to the left a positional value of 10, then 100, then 1000, and so on. The decimal number 234
//can be interpreted as 4 * 1 + 3 * 10 + 2 * 100. In the binary number system, the rightmost digit has
//a positional value of 1, the next digit to the left a positional value of 2, then 4, then 8, and so on.
//The decimal equivalent of binary 1101 is 1 * 1 + 0 * 2 + 1 * 4 + 1 * 8, or 1 + 0 + 4 + 8 or, 13.]