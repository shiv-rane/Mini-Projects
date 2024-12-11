import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDate;
public class User {
	int taskID;
	ArrayList<Task> task_list;
	public User() {
		task_list = new ArrayList<>();
		taskID=1;
	}
	public void addTask(String title,String description,LocalDate due_date) {
		Task task = new Task(taskID++,title,description,due_date);
		task_list.add(task);
	}
	public void deleteTask(int taskID) {
		for(Task task : task_list) {
			if(taskID==task.getTaskID()) {
				task_list.remove(task);
				return;
			}
			break;
		}
		System.out.println("> Task Not Found");
	}
	public void editTask(int taskID) {
		Scanner scan = new Scanner(System.in);
		for(Task task : task_list) {
			if(taskID == task.getTaskID()) {
				System.out.println("> Task Found");
				System.out.println(task);
				System.out.println("> Do you want to edit the title(y/n)");
				String title_choice = scan.nextLine();
				if(title_choice.equalsIgnoreCase("y")) {
					System.out.println("> Enter the title");
					String title = scan.nextLine();
					task.setTitle(title);
				}
				System.out.println("> Do you want to edit the Description(y/n)");
				String des_choice = scan.nextLine();
				if(des_choice.equalsIgnoreCase("y")) {
					System.out.println("> Enter the description");
					String description = scan.nextLine();
					task.setDescription(description);
				}
			}
			else {
				System.out.println("> Task not found");
			}
		}
	}
	public void listTask() {
		if(task_list.isEmpty()) {
			System.out.println("> No task to show");
		}
		else {
			for(Task task : task_list) {
				System.out.println(task);
			}
		}
		
	}
}
