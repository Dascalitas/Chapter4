package homeworkChapter4;

import java.util.Scanner;

public class Homework7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int largest = input.nextInt();
		int number;
		int largest2;
		int sec = input.nextInt();
		if (sec>largest) {
			largest2 = largest;
			largest = sec;
		}
		else 
			largest2 = sec;
		
		

		for (int x = 0; x < 7; x++) {

			number = input.nextInt();
			
			if (number > largest) {
				largest2 = largest;
				largest = number;
			}
			
			if (largest == largest2)
				largest2 = number;

			if (number < largest && number > largest2) {
				largest2 = number;
			}

		}
		System.out.println("the largest number is : " + largest);
		System.out.println("the second largest number is : " + largest2);
	}
}

//4.23	(Find the Two Largest Numbers) Using an approach similar to that for Exercise 4.21, find
//the two largest values of the 10 values entered. [Note: You may input each number only once.]