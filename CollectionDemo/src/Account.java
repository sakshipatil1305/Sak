
public class Account {

	private int balance = 500;

	public int getbalance() {
		return balance;
	}

	public void withdraw(int amount) {
		balance = balance - amount;
	}
}
