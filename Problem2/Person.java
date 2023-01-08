package Problem2;

public abstract class Person {
    protected ExamController examController;

    public Person(ExamController examController) {
        this.examController = examController;
    }

    public abstract void send(int ID);

}
