package homeworkChapter4;

import java.util.Scanner;

class Personal {
	private String name;
	private double salary;
	private double percent;

	Personal(String name, double salary, double percent) {
		this.name = name;
		this.salary = salary;
		this.percent = percent;
	}

	String getName() {
		return name;
	}

	double getSalary() {
		return salary;
	}

	double getPercent() {
		return percent;
	}

	void setName() {
		this.name = name;
	}

	void setSalary() {
		if (salary > 0)
			this.salary = salary;
		else {
			salary = 0;
			this.salary = salary;
		}
	}

	void percent(double sum) {
		if (percent > 0)
			this.percent = percent;
		else {
			percent = 0;
			this.percent = percent;
		}
	}

	double money(double sum) {
		double money = (sum * (percent / 100)) + salary;
		return money;
	}
}

public class Homework3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double sum = 0;
		double balance = 0;

		Personal akaki = new Personal("Kazantip Akakii ", 200, 9);
		System.out.printf("Please, enter all thinks saled by %s or -1 to exit:", akaki.getName());

		sum = input.nextDouble();
		System.out.println("enter the next think or -1 to exit:");

		while (sum > 0) {
			sum = input.nextDouble();
			balance += sum;
			System.out.println("enter the next think or -1 to exit:");
		}
		System.out.printf("In that month, %s have the %.2f $ salary", akaki.getName(), akaki.money(sum));
	}
}


//4.19	(Sales Commission Calculator) A large company pays its salespeople on a commission basis.
//The salespeople receive $200 per week plus 9% of their gross sales for that week. For example, a
//salesperson who sells $5,000 worth of merchandise in a week receives $200 plus 9% of $5000, or a
//total of $650. You’ve been supplied with a list of the items sold by each salesperson. The values of
//these items are as follows:
//Item Value
//1 239.99
//2 129.75
//3 99.95
//4 350.89
//Develop a Java application that inputs one salesperson’s items sold for last week and calculates and
//displays that salesperson’s earnings. There’s no limit to the number of items that can be sold.