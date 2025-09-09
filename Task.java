package assign1;

public class Task {
	private int id;
    private String title;
    private String description;
    private String status;  // TODO, IN PROGRESS, DONE
    private User assignedUser;

    // Constructor
    public Task(int id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = "TODO"; // default
    }

    // Getters/Setters
    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public String getStatus() { return status; }
    public User getAssignedUser() { return assignedUser; }

    public void setAssignedUser(User user) { this.assignedUser = user; }
    public void updateStatus(String status) { this.status = status; }

    // Overridden toString
    @Override
    public String toString() {
        return "Task [ID = " + id + ", Title = " + title + ", Status = " + status +
               ", Assigned To = " + (assignedUser != null ? assignedUser.getName() : "None") + "]";
    }
}
