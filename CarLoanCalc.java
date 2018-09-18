import java.util.Scanner;

public class CarLoanCalc {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter loan amount: ");
		int carLoan = input.nextInt();

		System.out.print("Enter loan length in years: ");
		int loanLength = input.nextInt();

		System.out.print("Enter interest rate: ");
		int interestRate = input.nextInt();

		System.out.print("Enter down payment: ");
		int downPayment = input.nextInt();
		input.close();

		// figures out if it's a valid loan
		if (loanLength <= 0 || interestRate <= 0) {
			System.out.println("Error! You must take out a valid car loan.");

			// double checks if the car can just be paid off
		} else if (downPayment >= carLoan) {
			System.out.println("The car can be paid in full");

		} else {
			int remainingBalance = carLoan - downPayment;
			// convert years to months
			int months = loanLength * 12;
			int monthlyBalance = remainingBalance / months;

			// determine monthly interest
			int interest = (monthlyBalance * interestRate) / 100;

			int monthlyPayment = monthlyBalance + interest;

			System.out.println("Your monthly payment will be $" + monthlyPayment);
		}
	}
}
