package homeworkChapter4;

class Account {
	private int number;
	private int balance;
	private int charge;
	private int credit;
	private int limit;

	Account(int number, int balance, int charge, int credit, int limit) {
		this.number = number;
		this.balance = balance;
		this.charge = charge;
		this.credit = credit;
		this.limit = limit;
	}

	int getNumber() {
		return number;
	}

	int getBalance() {
		return balance;
	}

	int getCharge() {
		return charge;
	}

	int getCredit() {
		return credit;
	}

	int getLimit() {
		return limit;
	}

	void setNumber() {
		this.number = number;
	}

	void setBalance(int balance) {
		if (balance < 0) {
			return;
		}
		this.balance = balance;
	}

	void setCharge(int charge) {
		if (charge < 0) {
			return;
		}
		this.balance = balance;
	}

	void setCredit(int credit) {
		if (credit < 0) {
			return;
		}
		this.credit = credit;
	}

	void setLimit(int limit) {
		if (limit < 0) {
			return;
		}
		this.limit = limit;
	}

	int calc() {
		int calc = balance + charge - credit;
		System.out.println("your balance for now is " + calc);
		if (calc < limit)
			System.out.println("Credit limit exceeded");
		return calc;
	}
}

public class Homework2 {

	public static void main(String[] args) {
		Account stewart = new Account(15, 10, 5, 15, 5);
		Account alice = new Account(20, 20, 10, 15, 5);

		stewart.calc();
		alice.calc();
	}

}

//
//4.18	(Credit Limit Calculator) Develop a Java application that determines whether any of several
//department-store customers has exceeded the credit limit on a charge account. For each customer,
//the following facts are available:
//a) account number
//b) balance at the beginning of the month
//c) total of all items charged by the customer this month
//d) total of all credits applied to the customer’s account this month
//e) allowed credit limit.
//The program should input all these facts as integers, calculate the new balance (= beginning balance
//+ charges – credits), display the new balance and determine whether the new balance exceeds the
//customer’s credit limit. For those customers whose credit limit is exceeded, the program should display the message "Credit limit exceeded".
