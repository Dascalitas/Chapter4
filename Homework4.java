package homeworkChapter4;

import java.util.Scanner;

class Employee {
	private String name;
	private int rate;

	Employee(String name, int rate) {
		this.name = name;
		this.rate = rate;
	}

	String getName() {
		return name;
	}

	int getRate() {
		return rate;
	}

	void setName() {
		this.name = name;
	}

	void setRate() {
		this.rate = rate;
	}

	double salary(int hours) {
		if (hours > 40) {
			double salary = ((hours - 40) * rate * 1.5) + (40 * rate);
			return salary;
		} else {
			double salary = hours * rate;
			return salary;
		}
	}
}

public class Homework4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int hours = 0;

		Employee akaki = new Employee("kazantip akaki", 40);

		for (int x = 1; x < 8; x++) {
			System.out.println("Please, enter the working hours");
			int time = input.nextInt();
			hours += time;
		}
		System.out.printf("in that week, %s have %.2f $ salary.", akaki.getName(), akaki.salary(hours));
	}
}

//4.20	(Salary Calculator) Develop a Java application that determines the gross pay for each of
//three employees. The company pays straight time for the first 40 hours worked by each employee
//and time and a half for all hours worked in excess of 40. You’re given a list of the employees, their
//number of hours worked last week and their hourly rates. Your program should input this information for each employee,
//then determine and display the employee’s gross pay. Use class Scanner to input the data.