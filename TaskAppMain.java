package assign1;

public class TaskAppMain {
	public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        // Create Users
        User u1 = new User(1, "Sakthi", "Developer", "sakthi@gmail.com");
        User u2 = new User(2, "Murugan", "Tester", "murugan@gmail.com");

        manager.addUser(u1);
        manager.addUser(u2);

        // Create Project
        Project p1 = new Project(101, "Banking System", "2025-09-30");
        manager.addProject(p1);

        // Add Members
        p1.addMember(u1);
        p1.addMember(u2);

        // Create Tasks
        Task t1 = new Task(1001, "Login Module", "Develop login feature");
        Task t2 = new Task(1002, "Testing", "Test login feature");

        p1.addTask(t1);
        p1.addTask(t2);

        // Assign Tasks
        manager.assignTask(t1, u1);
        manager.assignTask(t2, u2);

        // Update Task Status
        t1.updateStatus("IN PROGRESS");
        t2.updateStatus("TODO");

        System.out.println("=== Project Details ===");
        System.out.println(p1);

        System.out.println("\n=== All Tasks ===");
        manager.displayAllTasks();

        System.out.println("\n=== Tasks by User ===");
        manager.showTasksByUser(u1);
    }
}
