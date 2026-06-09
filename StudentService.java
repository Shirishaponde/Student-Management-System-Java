import java.util.ArrayList;

public class StudentService {

    ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student Added Successfully");
    }

    public void displayStudents() {

        if (students.isEmpty()) {
            System.out.println("No Records Found");
            return;
        }

        for (Student s : students) {
            s.display();
            System.out.println("----------------");
        }
    }

    public void searchStudent(int id) {

        for (Student s : students) {
            if (s.getId() == id) {
                s.display();
                return;
            }
        }

        System.out.println("Student Not Found");
    }

    public void updateStudent(int id, String name, String course) {

        for (Student s : students) {
            if (s.getId() == id) {
                s.setName(name);
                s.setCourse(course);
                System.out.println("Updated Successfully");
                return;
            }
        }

        System.out.println("Student Not Found");
    }
}
