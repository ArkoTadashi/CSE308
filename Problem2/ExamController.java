package Problem2;

import java.util.HashMap;

public class ExamController {

    private Teacher teacher;
    private HashMap<Integer, Student> students;

    public ExamController() {
        students = new HashMap<>();
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    public void addStudent(int ID, Student student) {
        this.students.put(ID, student);
    }
}
