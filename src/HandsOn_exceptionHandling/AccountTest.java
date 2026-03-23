package HandsOn_exceptionHandling;

import java.util.Scanner;

class PayOutOfBoundsException extends Exception {
    public PayOutOfBoundsException(String msg) {
        super(msg);
    }
}

// Account Management class
class AccountManagement {

    private double currentBalance = 80000;
    private final double MAX_LIMIT = 30000;

    // Check if debit is allowed
    public void checkForDebit(double amount) throws PayOutOfBoundsException {
    	if (amount > currentBalance) {
    	    throw new PayOutOfBoundsException("Insufficient balance");
    	}
    	if (amount > MAX_LIMIT) {
    	    throw new PayOutOfBoundsException("Transaction exceeds maximum limit of " + MAX_LIMIT);
    	}
    }

    // Withdraw amount
    public void withdrawAmount(double amount) throws PayOutOfBoundsException {
        checkForDebit(amount); // validate first
        currentBalance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + currentBalance);
    }

    public double getCurrentBalance() {
        return currentBalance;
    }
}
public class AccountTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        AccountManagement account = new AccountManagement();

        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();

        try {
            account.withdrawAmount(amount);
        } catch (PayOutOfBoundsException e) {
            System.out.println("Transaction Failed: " + e.getMessage());
        }
    }

}
