import java.time.LocalDate;
public class Task {
	private int taskID;
	private String title;
	private String description;
	private LocalDate due_date;
	
	public Task(int taskID, String title, String description, LocalDate due_date) {
		this.taskID=taskID;
		this.title=title;
		this.description=description;
		this.due_date=due_date;
	}
	public int getTaskID() {
		return taskID;
	}
	public void setTaskID(int taskID) {
		this.taskID=taskID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title=title;
	}
	public String getDescripition() {
		return description;
	}
	public void setDescription(String description) {
		this.description=description;
	}
	public LocalDate getDue_date() {
		return due_date;
	}
	public void setDue_date(LocalDate due_date) {
		this.due_date=due_date;
	}
	public String toString() {
		return "Task ID: " + taskID +  " || Title: " + title + " || Description: " + description + " || Due Date: " + due_date;
	}
}
