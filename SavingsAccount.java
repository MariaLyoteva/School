package packageArrays;

import java.util.Scanner; 

class SA {
	Scanner input = new Scanner(System.in);
	public double balance;
	public double interestRate = 0.01;
	public String name;
	public void displayCustomer() {
		System.out.println("Customer " + name);
	}
	public void withdraw() {
		double a;
		System.out.println("Amount of money to withdraw");
		a = input.nextDouble();
		if (balance < a) {
			System.out.println("You don't have enough money");
		}else if(a < 0) {
			System.out.println("Wrong value");
		}else {
			balance = balance - a;
		}
	}
	
}

public class SavingsAccount{

	public static void main(String[] args) {
		System.out.println("");
		SA sa001 = new SA();
		sa001.balance = 100;
		sa001.withdraw();
		System.out.println(sa001.balance);
	}

}