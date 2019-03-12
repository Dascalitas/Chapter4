package homeworkChapter4;

public class Homework9 {

	public static void main(String[] args) {

		int x = 5;
		int y = 8;

		System.out.println("A");

		if (y == 8)
			if (x == 5)
				System.out.println("@@@@@");

			else
				System.out.println("#####");
				System.out.println("$$$$$");
				System.out.println("&&&&&");

		System.out.println("B");

		if (y == 8)
			if (x == 5)
				System.out.println("@@@@@");

			else {
				System.out.println("#####");
				System.out.println("$$$$$");
				System.out.println("&&&&&");
			}

		System.out.println("C");

		if (y == 8)
			if (x == 5)
				System.out.println("@@@@@");

			else {
				System.out.println("#####");
				System.out.println("$$$$$");
				System.out.println("&&&&&");
			}

		System.out.println("D");

		y = 7;
		if (y == 8) {
			if (x == 5)
				System.out.println("@@@@@");
		}

		else
			System.out.println("#####");
		System.out.println("$$$$$");
		System.out.println("&&&&&");

	}

}

//4.28	(Another Dangling-else Problem) Modify the given code to produce the output shown in
//each part of the problem. Use proper indentation techniques. Make no changes other than inserting
//braces and changing the indentation of the code. The compiler ignores indentation in a Java program.
//We’ve eliminated the indentation from the given code to make the problem more challenging. 
//[Note: It’s possible that no modification is necessary for some of the parts.]
//if (y == 8)
//if (x == 5)
//System.out.println("@@@@@");
//else
//System.out.println("#####");
//System.out.println("$$$$$");
//System.out.println("&&&&&");
//a) Assuming that x = 5 and y = 8, the following output is produced:
//@@@@@
//$$$$$
//&&&&&
//b) Assuming that x = 5 and y = 8, the following output is produced:
//@@@@@
//c) Assuming that x = 5 and y = 8, the following output is produced:
//@@@@@
//d) Assuming that x = 5 and y = 7, the following output is produced. [Note: The last three
//output statements after the else are all part of a block.]
//#####
//$$$$$
//&&&&&
