// MVC Pattern Example
public class MVCPattern {

    // Model Class
    public static class Student {
        private String name;
        private String id;
        private String grade;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getGrade() {
            return grade;
        }

        public void setGrade(String grade) {
            this.grade = grade;
        }
    }

    // View Class
    public static class StudentView {
        public void displayStudentDetails(String studentName, String studentId, String studentGrade) {
            System.out.println("Student Details:");
            System.out.println("Name: " + studentName);
            System.out.println("ID: " + studentId);
            System.out.println("Grade: " + studentGrade);
        }
    }

    // Controller Class
    public static class StudentController {
        private Student model;
        private StudentView view;

        public StudentController(Student model, StudentView view) {
            this.model = model;
            this.view = view;
        }

        public void setStudentName(String name) {
            model.setName(name);
        }

        public String getStudentName() {
            return model.getName();
        }

        public void setStudentId(String id) {
            model.setId(id);
        }

        public String getStudentId() {
            return model.getId();
        }

        public void setStudentGrade(String grade) {
            model.setGrade(grade);
        }

        public String getStudentGrade() {
            return model.getGrade();
        }

        public void updateView() {
            view.displayStudentDetails(model.getName(), model.getId(), model.getGrade());
        }
    }

    // Test the MVC Implementation
    public static void main(String[] args) {
        Student model = new Student();
        model.setName("John Doe");
        model.setId("12345");
        model.setGrade("A");

        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);
        controller.updateView();

        controller.setStudentName("Jane Doe");
        controller.updateView();
    }
}
