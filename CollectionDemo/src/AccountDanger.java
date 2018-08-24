
public class AccountDanger implements Runnable {
	public static void main(String[] args) {
		AccountDanger r = new AccountDanger();
		Thread one = new Thread(r);
		Thread two = new Thread(r);
		one.setName("Fred");
		two.setName("Lucy");
		one.start();
		two.start();
	}

	private Account acc = new Account();

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			makewithdrwal(200);
			if (acc.getbalance() < 0) {
				System.out.println("Account is overdrawn");
			}
		}
	}

	synchronized public void makewithdrwal(int amt) {
		
	if (acc.getbalance() >= amt) {
			System.out.println(Thread.currentThread().getName() + "goes to withdraw");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			acc.withdraw(amt);
			System.out.println(Thread.currentThread().getName() + " completes the withdrawal");
		} else {
			System.out.println("Not enough in account for " + Thread.currentThread().getName() + "to withdraw "
					+ acc.getbalance());
		}

	}

}
