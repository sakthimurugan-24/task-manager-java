package assign1;

import java.util.ArrayList;
import java.util.List;

public class Project {
 private int projectId;
 private String projectName;
 private String deadline;
 private List<User> teamMembers;
 List<Task> tasks;
 
 public Project(int projectId, String projectName, String deadline) {
     this.projectId = projectId;
     this.projectName = projectName;
     this.deadline = deadline;
     this.teamMembers = new ArrayList<>();
     this.tasks = new ArrayList<>();
 }
 public void addMember(User user) {
     teamMembers.add(user);
 }
 public void addTask(Task task) {
     tasks.add(task);
 }
 public void displayTasks() {
     System.out.println("Tasks for Project: " + projectName);
     for (Task t : tasks) {
         System.out.println(t);
     }
 }
 @Override
 public String toString() {
     return "Project [ID = " + projectId + ", Name = " + projectName + ", Deadline = " + deadline + "]";
 }
}