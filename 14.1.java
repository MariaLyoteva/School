package smg;

public class Project14ex1 {

	public static void main(String[] args) {
		Account ac = new Account(1122, 20000, 4.5);
		ac.withdraw(2500);
		ac.deposit(3000);
		System.out.println(ac.getBalance());
		System.out.println(ac.getMonthlyInterestRate());
		System.out.println(ac.dateCreated());
		
	}

}
