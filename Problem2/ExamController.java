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
        students.put(ID, student);
    }

    public void send(Person person, int ID, int marks) {
        Student student = students.get(ID);
        if (person == teacher) {
            if (student.getMarks() == 0) {
                student.setMarks(marks);
                System.out.println("Student ID: " + ID + " got " + marks + " marks.");
            }
            else {
                student.setRechecked(true);
                if (student.getMarks() != marks) {
                    System.out.println("Marks of Student ID " + ID + " changed from " + student.getMarks() + " to " + marks + " marks.");
                    student.setMarks(marks);
                }
                else {
                    System.out.println("Marks of Student ID " + ID + " unchanged at " + marks + " marks.");
                    student.setMarks(marks);
                }
            }

        }
        else {
            if (student.isRechecked()) {
                System.out.println("Your marks have been rechecked already.");
            }
            else {
                teacher.recheck(ID, student.getMarks());
            }
        }
    }


}
