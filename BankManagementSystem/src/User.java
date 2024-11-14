import java.util.ArrayList;
public class User {
	ArrayList<Account> user_list ;
	
	public User() {
		user_list = new ArrayList<>();
	}
	public void createUser(int accNo , String accHolderName, double balance) {
		Account account = new Account(accNo,accHolderName,balance);
		user_list.add(account);
	}
	public void displayDetails() {
		for(int i = 0; i<user_list.size();i++) {
			System.out.println(user_list.get(i));
		}
	}
	public void deposit(int accNo,double amount) {
		if(amount<0) {
			System.out.println("enter valid amount");
		}
		else {
			for(int i = 1 ; i<user_list.size(); i++) {
			Account account = user_list.get(i);
				if(account.getAccNo() == accNo) {
					double newBalance = account.getBalance() + amount;
					account.setBalance(newBalance);
					return;
				}
			}
			System.out.println("Account not found");
		}
	}
}
