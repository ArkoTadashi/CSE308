package Problem2;

import java.util.Random;

public class Teacher extends Person {

    public Teacher(ExamController examController) {
        super(examController);
    }

    @Override
    public void send(int ID) {
        Random random = new Random();
        int marks = random.nextInt(100);
        examController.send(this, ID, marks);
    }

    public void recheck(int ID, int marks) {
        Random random = new Random();
        int rand = random.nextInt()%2;

        if (rand == 0) {
            int mark = marks+random.nextInt(100-marks);
            examController.send(this, ID, mark);
        }
        else {
            examController.send(this, ID, marks);
        }
    }

}
