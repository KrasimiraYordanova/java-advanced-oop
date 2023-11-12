import java.util.HashMap;
import java.util.Map;

public class StudentRepositoryP {

    private Map<String, StudentP> studentByName;

    public StudentRepositoryP() {
        this.studentByName = new HashMap<>();
    }

    public void create(StudentP student) {
        this.studentByName.putIfAbsent(student.getName(), student);
    }

    public StudentP get(String name) {
        return studentByName.get(name);
    }
}
