package HandsOn_Oops;

class Account {
	private String id;
	private String name;
	private int balance;

	Account(String id, String name) {
		this.id = id;
		this.name = name;
		this.balance = 0;
	}

	Account(String id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getBalance() {
		return balance;
	}

	public int credit(int amount) {
		balance = amount + balance;
		return balance;
	}

	public int debit(int amount) {
		if (balance >= amount) {
			balance = balance - amount;
		} else {
			System.out.println("Amount exceeded balance");
		}
		return balance;
	}

	public int transferTo(Account another, int amount) {
		if (balance >= amount) {
			this.balance = this.balance - amount;
			another.balance = another.balance + amount;
		} else {
			System.out.println("Amount exceeded balance");
		}
		return balance;

	}

	public String toString() {
		return "Account[id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}

}

public class BankingSystem {

	public static void main(String[] args) {

		// create accounts
		Account acc1 = new Account("A101", "Ravi", 5000);
		Account acc2 = new Account("A102", "Kumar", 2000);

		// Display initial accounts
		System.out.println(acc1);
		System.out.println(acc2);

		// credit
		acc1.credit(1000);
		System.out.println("After credit: " + acc1);

		// Debit
		acc1.debit(2000);
		System.out.println("After debit: " + acc1);

		// Transfer
		acc1.transferTo(acc2, 1000);
		System.out.println("After transfer:");
		System.out.println(acc1);
		System.out.println(acc2);
	}

}
