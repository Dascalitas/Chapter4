package homeworkChapter4;

import java.util.Scanner;

public class Homework11 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Please, enter the number - ");
		int x = input.nextInt();

		if (x > 9999 && x < 100000) {

			int a = x / 10000;
			int b = (x / 1000) % 10;
			int c = (x / 100) % 10;
			int d = (x % 100) / 10;
			int e = x % 10;

			int y = (e * 10000) + (d * 1000) + (c * 100) + (b * 10) + e;

			if (x == y)
				System.out.print("this number is palindromic");
			else
				System.out.print("this number is not palindromic");
		} else
			System.out.println("please enter only five digit number");
	}

}


//4.30	(Palindromes) A palindrome is a sequence of characters that reads the same backward as forward. 
//For example, each of the following five-digit integers is a palindrome: 12321, 55555, 45554 and 11611. 
//Write an application that reads in a five-digit integer and determines whether it’s a palindrome.
//If the number is not five digits long, display an error message and allow the user to enter a new value. 
