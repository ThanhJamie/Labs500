package OBJ;

/**
 *
 * @author GMT
 */
public class Student {

    private final String studentId;
    private String name;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentId: " + this.getStudentId() + ", Student name: " + this.getName();
    }

    public void output() {
        System.out.println("Student: " + this.getStudentId() + ", Student name: " + this.getName());
    }
}
