import java.util.Scanner;
import java.lang.*;

class Account {
	String name;
	int acc_no;
	boolean current;
	double balance = 0;
	int min_balance = 100;
	Scanner sc = new Scanner(System.in);

	Account(){
		if(this.getClass() == CurrentAcc.class){
			current = true;
		} else {
			current = false;
		}
		System.out.print("Enter name: ");
		name = sc.next();
		System.out.print("Enter account no.: ");
		acc_no = sc.nextInt();	
	}

	void deposit() {
		System.out.print("Enter deposit amount: ");
		balance += sc.nextDouble();
	}

	void withdraw() {
		System.out.print("Enter withdraw amount: ");
		double withdraw = sc.nextDouble();
		while (withdraw > balance) {
			System.out.print("Withdraw amount greater than balance, enter new amount: ");
			withdraw = sc.nextDouble();
		}
		balance -= withdraw;
		if (current && balance < min_balance) {
			System.out.println("Below min balance of 100, removing remaining money in account");
			balance = 0;
		}
	}

	void withdraw(double withdraw) {
		if (withdraw > balance) {
			System.out.println("Withdraw amount greater than balance");
		}
		if (current && balance < min_balance) {
			System.out.println("Below min balance of 100, removing remaining money in account");
			balance = 0;
		}
	}

	void showBalance() {
		System.out.print("balance = " + balance);
	}
}

class CurrentAcc extends Account {
	void cheque(){
		System.out.print("Enter cheque amount: ");
		double cheque = sc.nextDouble();
		withdraw(cheque);
		System.out.println("Cheque created...");

	}
}

class SavingsAcc extends Account {
	void compound(int t, int r) {
		balance = balance * (Math.pow((1 + ((double) r / 100)), t));
		System.out.print("Balance after given rate and time = " + balance);
	}
}

class Bank {
	public static void main(String args[]) {
		SavingsAcc john = new SavingsAcc();
		CurrentAcc smith = new CurrentAcc();
		Account ref = null;
		Scanner sc = new Scanner(System.in);
		int acc, choice;
		System.out.println("------MENU------\n");
		System.out.println(
				"1.Deposit\n2.Withdraw\n3.Compute intrest for Savings Acc\n4.Display account details\n5. Create cheque\n6.Exit\nChoice:");
		choice = sc.nextInt();
		System.out.println("Enter account no.: ");
		acc = sc.nextInt();
		if (acc == 1) {
			ref = john;
		} else {
			ref = smith;
		}
		while (choice != 6) {
			if (choice == 1) {
				ref.deposit();
			} else if (choice == 2) {
				ref.withdraw();
			} else if (choice == 3) {
				if (acc == 1) {
					john.compound(1, 5);
				} else {
					System.out.println("Not a savings account");
				}
			} else if (choice == 4) {
				ref.showBalance();
			} else if (choice == 5) {
				if (acc == 2) {
					smith.cheque();
				} else {
					System.out.println("Not a current account");
				}
			}
			System.out.println("Enter account no.: ");
			acc = sc.nextInt();
			System.out.println("------MENU------\n");
			System.out.println(
					"1.Deposit\n2.Withdraw\n3.Compute intrest for Savings Acc\n4.Display account details\n5. Create cheque\n6.Exit\nChoice:");
			choice = sc.nextInt();
		}

	}
}
