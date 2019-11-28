package Bankdetails;
import java.util.Scanner;
public abstract class BankTransaction implements Bankprocess {
	
		Scanner sc = new Scanner(System.in);
		int balance, withdraw, deposite;

		public void showBalance() {
			System.out.println("Intial balance in the account ");
			balance = sc.nextInt();
		}

		public void withdraw() {
			System.out.println("Enter amount you want to withdraw");
			withdraw = sc.nextInt();
			balance = balance - withdraw;
			System.out.println("Balance amount after withdrawl is : " + balance);
		}
		public void deposit() {
			System.out.println("Enter amount you want to deposit  ");
			int deposit = sc.nextInt();
			balance = balance + deposit;
			System.out.println("Balance amount after deposit is : " + balance);
		}

	}


