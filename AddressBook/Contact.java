import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Contact {
		
	String name;
	String phoneno;
	String email;
	
	
		ArrayList<Contact> contacts = new ArrayList<>(); ;
		Scanner scanner = new Scanner(System.in);
		
		public Contact() {
			
		}
		
		public Contact(String name, String phoneno, String email){
			this.name=name;
			this.phoneno=phoneno;
			this.email=email;
		}
		public String getName() {
			return name;
		}
		public String getPhoneno() {
			return phoneno;
		}
		public String getEmail() {
			return email;
		}
		
		public void addDetails() {
		System.out.println("Enter Name: ");
		String name = scanner.nextLine();
		
		String phoneno;
		final String phoneRegex = "^[7-9]\\d{9}$";
		
		while(true) {
			System.out.println("Enter Phone Number: [+91]");
			phoneno = scanner.nextLine();
			if(phoneno.matches(phoneRegex)) {
				break;
			}
			else {
				System.out.println("Enter valid phone number");
			}
			}
		
		String email;
		final String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
		
		while (true) {
			System.out.println("Enter Email: ");
			email = scanner.nextLine();
			if(email.matches(emailRegex)) {
				break;
			}
			else {
				System.out.println("Please enter valid email");
			}
		}
		
		Contact contact = new Contact(name, phoneno, email);
		contacts.add(contact);
		System.out.println("Details added successfully");
		}
		public void deleteContact() {
		System.out.println("Enter the name to delete");
		String name = scanner.nextLine();
		
		for(int i = 0; i<contacts.size(); i++) {
			if(contacts.get(i).getName().equalsIgnoreCase(name)) {
				contacts.remove(i);
				System.out.println("Contact removed");
				return;
			}
		}
		System.out.println("Contact not found");
		}
		public void displayDetails() {
			if(contacts.isEmpty()) {
				System.out.println("No contact found");
			}
			else {
				for(Contact contact : contacts) {
					System.out.println("Name: " + contact.name+ " || " + " Email: " + contact.email+ " || "+ " Phone no.: " + contact.phoneno);
				}
			}
			
		}
		public static void main(String[] args) {
			Contact contact = new Contact();
			Scanner read = new Scanner(System.in);
			int choice=0;
			while(true){
			System.out.println("Select the operation:");
			System.out.println("\t1. Add Details");
			System.out.println("\t2. Delete Details");
			System.out.println("\t3. Display Details");
			System.out.println("\t4. Exit");
			System.out.println("---------------------------");
			
			try {
				choice = read.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("Please select valid operation");
			}
			
			read.nextLine();
				switch(choice) {
				case 1: 
					contact.addDetails();
					break;
				case 2:
					contact.deleteContact();
					break;
				case 3:
					contact.displayDetails();
					break;
				case 4: 
					System.out.println("Exiting the program: ");
					read.close();
					return;
				default:
					System.out.println("Invalid Choice!!");
				}
			}
		}
}
