package assign1;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<User> users;
    private List<Project> projects;

    public TaskManager() {
        users = new ArrayList<>();
        projects = new ArrayList<>();
    }
    public void addUser(User user) {
        users.add(user);
    }

    public void addProject(Project project) {
        projects.add(project);
    }

    public void assignTask(Task task, User user) {
        task.setAssignedUser(user);
    }

    public void displayAllTasks() {
        for (Project p : projects) {
            p.displayTasks();
        }
    }
    public void showTasksByUser(User user) {
        System.out.println("Tasks assigned to: " + user.getName());
        for (Project p : projects) {
            for (Task t : p.tasks) {
                if (t.getAssignedUser() != null && t.getAssignedUser().equals(user)) {
                    System.out.println(t);
                }
            }
        }
    }
}
