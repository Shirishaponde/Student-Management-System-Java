import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentService();

        while (true) {

            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Count Students");
            System.out.println("7. Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();

                    service.addStudent(
                            new GraduateStudent(id, name, course));
                    break;

                case 2:
                    service.displayStudents();
                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    service.searchStudent(sc.nextInt());
                    break;

                case 4:

                    System.out.print("Enter ID: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter New Name: ");
                    String newName = sc.nextLine();

                    System.out.print("Enter New Course: ");
                    String newCourse = sc.nextLine();

                    service.updateStudent(
                            updateId,
                            newName,
                            newCourse);
                    break;

                case 5:
                    System.out.print("Enter ID: ");
                    service.deleteStudent(sc.nextInt());
                    break;

                case 6:
                    service.countStudents();
                    break;

                case 7:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}