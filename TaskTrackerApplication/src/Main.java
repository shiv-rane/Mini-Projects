import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
public class Main {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	User user = new User();
	
	while(true) {
		System.out.println("1. Add Task");
		System.out.println("2. Delete Task");
		System.out.println("3. Edit Task");
		System.out.println("4. List Task");
		System.out.println("5. Exit");
		System.out.print("Choose the option: ");
		int choice = scan.nextInt();
		scan.nextLine();
		switch(choice) {
		case 1:
			System.out.println("Enter the Title: ");
			String title = scan.nextLine();
			
			System.out.println("Enter the Description: ");
			String description = scan.nextLine();
			
			
			System.out.println("Enter the due date (yyyy-MM-dd): ");
		    String dateInput = scan.nextLine();
		    LocalDate dueDate = null;
		    try {
		        dueDate = LocalDate.parse(dateInput, formatter);
		    }
		    catch (DateTimeParseException e) {
		        System.out.println("Invalid date format. Please enter the date in yyyy-MM-dd format.");
		    }
		    if(dueDate!=null) {
		    	user.addTask(title,description,dueDate);
		    }
		    else {
		    	System.out.println("Task not added due to invalid date");
		    }
		    
		    break;
		case 2:
			System.out.println("Enter the ID to delete task");
			int deleteTask = scan.nextInt();
			user.deleteTask(deleteTask);
			break;
		case 3:
			System.out.println("Enter the ID of task to edit");
			int taskID = scan.nextInt();
			user.editTask(taskID);
			break;
		case 4:
			user.listTask();
			break;
		case 5:
			System.out.println("Exiting...");
			return;
		default:
			System.out.println("Invalid choice");
		}
		
	}	
	}
}
