package atm;

import java.util.Scanner;

public class AtmDisplay {

	public static final String RED = "\u001B[31m";
	public static final String RESET = "\u001B[0m";
	public static final String YELLOW = "\u001B[33m";
	public static final String Magenta = "\u001B[35m";
	public static final String Cyan = "\u001B[36m";

	public static void main(String[] args) {
		AtmInterface ai = new AtmImpl();
		int cardno = 12345;
		int pinno = 123;
		Scanner in = new Scanner(System.in);
		System.out.println(Magenta + " *** Welcome to ATM Machine ***" + RESET);
		System.out.print("Enter Atm Number : ");
		int atmNumber = in.nextInt();
		System.out.print("Enter Pin: ");
		int pin = in.nextInt();

		if ((cardno == atmNumber) && (pinno == pin)) {
			while (true) {
				System.out.println(Cyan + "1.View Available Balance");
				System.out.println("2.Deposit Amount");
				System.out.println("3.Withdraw Amount");
				System.out.println("4.View Ministatement");
				System.out.println("5.Exit");

				System.out.println("Enter Choice : " + RESET);
				int ch = in.nextInt();
				if (ch == 1) {
					ai.viewBalance();

				} else if (ch == 2) {
					System.out.println("Enter Amount to Deposit :");
					double depositAmount = in.nextDouble();
					ai.depositAmount(depositAmount);

				} else if (ch == 3) {
					System.out.println("Enter Amount to Deposit :");
					double withdrawAmount = in.nextDouble();
					ai.withdrawAmount(withdrawAmount);

				} else if (ch == 4) {
					ai.viewMiniStatement();

				} else if (ch == 5) {
					System.out.println(Magenta + "Collect your ATM Card\n Thank you for using ATM Machine !!!" + RESET);
					System.exit(0);
				} else {
					System.out.println(YELLOW + "Please enter valid choice !" + RESET);
				}
			}
		} else {
			System.out.println(RED + "Incorrect Atm Number or Pin !!!" + RESET);
			System.exit(0);
		}
	}
}
