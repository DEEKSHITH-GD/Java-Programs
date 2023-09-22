import java.util.Scanner;

public class Atm {

	public static void main(String[] args) {
		int balance = 15000;
		int deposit = 0;
		int withdraw = 0;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("========== WELCOME TO THE ATM ==========");
			System.out.println("Choose 1 for withdrawal");
			System.out.println("Choose 2 for Deposit");
			System.out.println("Choose 3 for A/C Balance");
			System.out.println("Choose 4 for Exiting");
			int choice = sc.nextInt();
			switch(choice){
				case 1: System.out.println("Enter the Withdrawal Amount: ");
				withdraw = sc.nextInt();
				if(balance >= withdraw) {
					balance -= withdraw;
				}
				else {
					System.out.println("You have Insufficient A/C Balance");
				}
				break;
				case 2: System.out.println("Enter the amount to deposit");
				deposit = sc.nextInt();
				balance += deposit;
				break;
				case 3: System.out.println("Your current A/C balance is: "+balance);
				break;
				case 4: System.exit(0);
			}
		}
	}
}
