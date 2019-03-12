package homeworkChapter4;

import java.util.Scanner;

public class Homework15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("please enter your factorial:");

		int fact = input.nextInt();
		int count = fact;
		
			if (fact > 0) {
		while (count > 1) {
			count--;
			fact *= count;
			}

			System.out.println("result of factorial is " + fact);
		}
		else if (fact==0)
			System.out.println("result is 1");
		else
			System.out.println("you enter negative number.");
		

		System.out.println("please enter number of terms to calc:");
		int k = input.nextInt();
		double e = 1;
		double fact2 = 1;
		int count2 = 1;
		
		while (count2<k) {
			fact2*=count2;
			count2++;
			e+=(1/fact2);
		}
				
		System.out.println("e is "+e);
		
		System.out.println("please enter number of terms to calc:");
		int k2 = input.nextInt();
		System.out.println("please input value of \"x\":");
		int x = input.nextInt();
		int pow = 0;
		double e2 = 1;
		double fact3 = 1;
		double count3 = 1;
		
		while (count3<k2) {
			fact3*=count3;
			count3++;
			pow++;
			e2+=Math.pow(x , pow)/fact3;
		}
		System.out.println("e of x is "+e2);
	}
}


//4.37	(Factorial) The factorial of a nonnegative integer n is written as n! (pronounced “n factorial”) and is defined as follows:
//	n! = n · (n – 1) · (n – 2) · … · 1 (for values of n greater than or equal to 1)
//	and
//	n! = 1 (for n = 0)
//	For example, 5! = 5 · 4 · 3 · 2 · 1, which is 120.
//	a) Write an application that reads a nonnegative integer and computes and prints its factorial.
//	b) Write an application that estimates the value of the mathematical constant e by using
//	the following formula. Allow the user to enter the number of terms to calculate.
//	c) Write an application that computes the value of e
//	x
//	 by using the following formula. Allow the user to enter the number of terms to calculate.
//	 