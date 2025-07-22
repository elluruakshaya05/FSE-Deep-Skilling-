public class MVCTest {
    public static void main(String[] args) {
        // Create model and view
        Student model = new Student("Alice", "S001", "A");
        StudentView view = new StudentView();

        // Create controller and link model/view
        StudentController controller = new StudentController(model, view);

        // Initial display
        controller.updateView();

        // Update data using controller
        controller.setStudentName("Bob");
        controller.setStudentGrade("A+");

        // Display updated data
        controller.updateView();
    }
}

