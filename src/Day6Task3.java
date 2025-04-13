import human.Student;
import human.Teacher;

public class Day6Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Georg", "programming");
        Student student = new Student("Den");
        teacher.evaluate(student);
    }
}
