
public class Account {
	private int accNo;
	private String accHolderName;
	private double balance;
	
	public Account(int accNo, String accHolderName, double balance) {
		this.accNo=accNo;
		this.accHolderName=accHolderName;
		if(balance < 0) {
			System.out.println("Invalid balance setting balance to 0");
			this.balance = 0;
		}
		else {
			this.balance=balance;
		}
	}
	public int getAccNo() {
		return accNo;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
	public String toString() {
		return "Account Number: " + accNo + "|| Holder Name: " + accHolderName + "|| Balance: " + balance;
	}
}
