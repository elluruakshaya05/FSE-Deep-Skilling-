import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskLinkedList taskList = new TaskLinkedList();

        while (true) {
            System.out.println("\n=== Task Management Menu ===");
            System.out.println("1. Add Task");
            System.out.println("2. Search Task");
            System.out.println("3. Display All Tasks");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Task ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Task Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Status: ");
                    String status = scanner.nextLine();
                    taskList.addTask(new Task(id, name, status));
                    break;

                case 2:
                    System.out.print("Enter Task ID to search: ");
                    int searchId = scanner.nextInt();
                    Task task = taskList.searchTask(searchId);
                    if (task != null) {
                        System.out.println(task);
                    } else {
                        System.out.println("Task not found.");
                    }
                    break;

                case 3:
                    taskList.displayTasks();
                    break;

                case 4:
                    System.out.print("Enter Task ID to delete: ");
                    int deleteId = scanner.nextInt();
                    taskList.deleteTask(deleteId);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}

