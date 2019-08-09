import java.util.HashMap;
import java.util.Map;

public class StudentsRepository {


    private Map<String,Student> students;


    public StudentsRepository() {
        this.students = new HashMap<>();
    }

    public boolean containsByName(String name) {
        return this.students.containsKey(name);
    }

    public void registerStudent(String name, Student student) {
        this.students.put(name,student);
    }

    public Student findByName(String name) {
        return this.students.get(name);
    }
}
