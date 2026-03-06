package HandsOn_Oops5;

import java.time.YearMonth;
import java.util.Scanner;

//base abstract class
abstract class Payment {
	protected String transactionId;
	protected double amount;
	protected String customerName;
	protected String paymentStatus;

	public Payment(String transactionId, double amount, String customerName) {
		this.transactionId = transactionId;
		this.amount = amount;
		this.customerName = customerName;
		this.paymentStatus = "Pending";// default status=pending
	}

	// Abstract Methods
	public abstract boolean validatePayment();

	public abstract boolean processPayment();

	/*
	 * concrete method execute Transaction payment workflow: validate → process
	 * →receipt.
	 */
	public final void executeTransaction() {
		if (validatePayment()) {
			System.out.println("Validation successful.");
			if (processPayment()) {
				this.paymentStatus = "Success";
			} else {
				this.paymentStatus = "Failed";
			}
		} else {
			this.paymentStatus = "Invalid";
			System.out.println("Validation Invalid..");
		}
		generateReceipt();
	}

	public void generateReceipt() {
		System.out.println("Transaction Id: " + getTransactionId());
		System.out.println("Customer: " + this.customerName);
		System.out.println("Amount: " + getAmount());
		System.out.println("Payment Status: " + getPaymentStatus());

	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public double getAmount() {
		return amount;
	}

}

//concrete class CreditCardPayment 
class CreditCardPayment extends Payment {
	String cardNumber;
	String cvv;
	String expiryDate;

	public CreditCardPayment(String transactionId, double amount, String customerName, String cardNumber, String cvv,
			String expiryDate) {
		super(transactionId, amount, customerName);
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.expiryDate = expiryDate;
	}

	@Override
	public boolean validatePayment() {

		if (cardNumber.length() != 16)
			return false;

		if (cvv.length() != 3)
			return false;

		if (!expiryDate.matches("(0[1-9]|1[0-2])/\\d{2}"))
			return false;

		String[] parts = expiryDate.split("/");
		int month = Integer.parseInt(parts[0]);
		int year = 2000 + Integer.parseInt(parts[1]);

		YearMonth expiry = YearMonth.of(year, month);
		YearMonth current = YearMonth.now();

		return expiry.isAfter(current) || expiry.equals(current);
	}

	@Override
	public boolean processPayment() {
		System.out.println("Processing Credit Card Payment...");
		return true;
	}

}

//concrete class UPIPayment 
class UPIPayment extends Payment {
	String upiId;
	String upiPin;

	public UPIPayment(String transactionId, double amount, String customerName, String upiId, String upiPin) {
		super(transactionId, amount, customerName);
		this.upiId = upiId;
		this.upiPin = upiPin;
	}

	@Override
	public boolean validatePayment() {

		// Check UPI ID with '@'
		if (!upiId.contains("@")) {
			return false;
		}

		// Check PIN length
		if (upiPin.length() != 4 && upiPin.length() != 6) {
			return false;
		}

		// check elements as characters
		for (int i = 0; i < upiPin.length(); i++) {
			if (!Character.isDigit(upiPin.charAt(i))) {
				return false;
			}
		}

		return true;
	}

	@Override
	public boolean processPayment() {
		System.out.println("Processing UPI payment...");
		return true;
	}
}

//concrete class NetBankingPayment
class NetBankingPayment extends Payment {
	String bankName;
	String accountNumber;
	String ifscCode;

	public NetBankingPayment(String transactionId, double amount, String customerName, String bankName,
			String accountNumber, String ifscCode) {
		super(transactionId, amount, customerName);
		this.bankName = bankName;
		this.accountNumber = accountNumber;
		this.ifscCode = ifscCode;
	}

	@Override
	public boolean validatePayment() {

		if (accountNumber.length() < 9 || accountNumber.length() > 18)
			return false;

		for (char c : accountNumber.toCharArray())
			if (!Character.isDigit(c))
				return false;

		if (ifscCode.length() != 11 || ifscCode.charAt(4) != '0')
			return false;

		return true;
	}

	@Override
	public boolean processPayment() {
		System.out.println("Processing NetBanking transaction...");
		return true;
	}
}

public class DigitalOnlinePayment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter customer name: ");
		String customerName = sc.nextLine();
		System.out.print("Enter transaction Id: ");
		String transactionId = sc.nextLine();
		System.out.print("Enter Amount: ");
		double amount = sc.nextDouble();
		System.out.print("Enter way of payment 1-creditcard, 2-upipayment, 3-netbanking: ");
		int paymentOption = sc.nextInt();
		sc.nextLine();
		Payment p = null;

		switch (paymentOption) {

		case 1:
			System.out.println("Enter Card Number:");
			String cardNumber = sc.nextLine();

			System.out.println("Enter CVV:");
			String cvv = sc.nextLine();

			System.out.println("Enter Expiry Date (MM/YY):");
			String expiryDate = sc.nextLine();

			p = new CreditCardPayment(transactionId, amount, customerName, cardNumber, cvv, expiryDate);
			break;

		case 2:
			System.out.println("Enter UPI ID:");
			String upiId = sc.nextLine();

			System.out.println("Enter UPI PIN:");
			String upiPin = sc.nextLine();

			p = new UPIPayment(transactionId, amount, customerName, upiId, upiPin);
			break;

		case 3:
			System.out.println("Enter Bank Name:");
			String bankName = sc.nextLine();

			System.out.println("Enter Account Number:");
			String accountNumber = sc.nextLine();

			System.out.println("Enter IFSC Code:");
			String ifscCode = sc.nextLine();

			p = new NetBankingPayment(transactionId, amount, customerName, bankName, accountNumber, ifscCode);
			break;

		default:
			System.out.println("Invalid Payment Option");
		}
		p.executeTransaction();
		sc.close();
	}

}
