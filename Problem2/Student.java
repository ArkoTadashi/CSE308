package Problem2;

public class Student extends Person {

    private int ID;
    private int marks;
    private boolean rechecked;

    public Student() {
        rechecked = false;
    }

    @Override
    public void send() {

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
}
