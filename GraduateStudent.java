public class GraduateStudent extends Student {

    public GraduateStudent(int id, String name, String course) {
        super(id, name, course);
    }

    @Override
    public void display() {
        System.out.println("Graduate Student Details");
        super.display();
    }
}