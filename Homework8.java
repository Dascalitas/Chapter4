package homeworkChapter4;

import java.security.SecureRandom;
import java.util.Scanner;

public class Homework8 {

	public static void main(String[] args) {
	      
	      Scanner input = new Scanner(System.in);

	      System.out.println("Enter number one or two (1 or 2): ");
	      
	      int count = 1;
	      int print = input.nextInt();

	    
	      while (print != 1 && print != 2) {
	        
			SecureRandom randomNumbers = new SecureRandom();
			int order = 1 + randomNumbers.nextInt(6);
			switch (order) {
			case 1:
				System.out.println("Are you kidding? i say one or two: ");
				break;
			case 2:
				System.out.println("oh, you're serious? only one or two");
				break;
			case 3:
				System.out.println("no, no no... i say only one ro two.");
				break;
			case 4:
				System.out.println("do you no how it look numbers one or two? when insert that.");
				break;
			case 5:
				System.out.println(
						"Well, i think you forget what i say. Ok, i repeat only for you - insert numbers one or two.");
				break;
			case 6:
				System.out.println("please, be good boy, insert numbers one or two.");
				break;
			}

			print = input.nextInt();

			count ++;
		}

	     System.out.println("Oh, you did it.");

	      if (count > 3)
	         System.out.printf("In only %d tries. You're genius.", count);
	   } 
}

 
//4.24	(Validating User Input) Modify the program in Fig. 4.12 to validate its inputs. 
//For any input, if the value entered is other than 1 or 2, keep looping until the user enters a correct value.