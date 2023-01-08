package Problem2;

public class Student extends Person {

    private int ID;
    private int marks;
    private boolean rechecked;

    public Student(ExamController examController, int ID) {
        super(examController);
        this.ID = ID;
        marks = 0;
        rechecked = false;
    }


    public void setID(int ID) {
        this.ID = ID;
    }
    public int getID() {
        return ID;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
    public int getMarks() {
        return marks;
    }

    public void setRechecked(boolean rechecked) {
        this.rechecked = rechecked;
    }
    public boolean isRechecked() {
        return rechecked;
    }

    @Override
    public void send(int ID) {
        examController.send(this, ID, marks);
    }


}
