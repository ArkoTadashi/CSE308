package Problem2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ExamController examController = new ExamController();

        Teacher teacher = new Teacher(examController);
        List<Student> studentList = new ArrayList<>();
        examController.setTeacher(teacher);

        for (int i = 0; i < 5; i++) {
            int ID = 1905106+i;
            Student student = new Student(examController, ID);
            studentList.add(student);
            examController.addStudent(ID, student);
            teacher.send(ID);
        }

        while(true) {
            System.out.println("Do you want to recheck? Type Yes or No.");
            String read = br.readLine();
            if (read.equalsIgnoreCase("No")) {
                break;
            }

            System.out.println("What is your ID?");
            read = br.readLine();
            int ID = Integer.parseInt(read);
            Student student = studentList.get(ID-1905106);
            student.send(ID);
        }






    }
}
