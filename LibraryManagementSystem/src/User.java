import java.util.Scanner;
public class User {
	int userID;
	String name;
	String email;
	long phoneNumber;
}
class Librarian extends User {
	public Librarian(int userID, String name, String email, long phoneNumber) {
		this.userID = userID;
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	
}
class Member extends User {
	
	public Member() {
		Scanner scan = new Scanner(System.in);
		this.userID = scan.nextInt();
		this.name = scan.nextLine();
		this.email = scan.nextLine();
		this.phoneNumber = scan.nextLong();
	}
}