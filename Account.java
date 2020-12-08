package smg;
import java.util.Date;

public class Account {
	private int ID = 0;
	private double balance = 0;
	private static double yearInterestRate = 0;
	private Date date = new Date();
	Account(){
		
	}
	Account(int newId, double newBalance, double newYearInterestRate){
		this.ID = newId;
		this.balance = newBalance;
		this.yearInterestRate = newYearInterestRate;
	}
	String dateCreated() {
		return date.toString();
	}
	void setID(int newID) {
		this.ID = newID;
	}
	void setBalance(int newBalance) {
		this.balance = newBalance;
	}
	void setYearInterestRate(int newYearInterstRate) {
		this.yearInterestRate = newYearInterstRate;
	}
	int getID() {
		return this.ID;
	}
	double getBalance() {
		return this.balance;
	}
	double getYearInterestRate() {
		return this.yearInterestRate;
	}
	double getMouthlyInterestRate() {
		return this.yearInterestRate/12;
	}
	double getMontlyInterest() {
		return (this.yearInterestRate/12)*this.balance;
	}
	void withdraw(int a) {
		balance = balance - a;
	}
	void deposit(int a) {
		balance = balance + a;
	}
}
