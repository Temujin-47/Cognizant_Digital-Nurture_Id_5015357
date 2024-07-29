public class MVCPatternTest {
    public static void main(String[] args) {
        Student model = new Student("Shavkat Silva", "12345", "A");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        // Initial display
        controller.updateView();

        // Update the student's name and grade
        controller.setStudentName("Quinton Rampage");
        controller.setStudentGrade("B+");

        // Display updated details
        controller.updateView();
    }
}
