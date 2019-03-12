package homeworkChapter4;

public class Homework6 {

	public static void main(String[] args) {
		int x = 1;
		System.out.println("N\t10*N\t100*N\t1000*N");

		while (x < 6) {
			System.out.print(x + "\t");
			while (x <= 500) {
				x *= 10;
				System.out.print(x + "\t");
			}
			System.out.println();
			x /= 1000;
			x++;
		}

	}
}

//4.22	(Tabular Output) Write a Java application that uses looping to print the following table of
//values:
//	N 10*N 100*N 1000*N
//	1 10 	100 1000
//	2 20 	200 2000
//	3 30 	300 3000
//	4 40 	400 4000
//	5 50 	500 5000	
	
	
	
	
