package exercises.school;

public class Student {
    private String name;
    private int studentId;
    private double GPA = 0.0;
    private int numberOfCredits = 0;

    public String getName() {
        return this.name;
    }
    public void setName(String aName) {
        this.name = aName;
    }

    public int getStudentId() {
        return this.studentId;
    }
    public void setStudentId(int aStudentId) {
        this.studentId = aStudentId;
    }

    public double getGPA() {
        return this.GPA;
    }
    public void setGPA(double aGPA) {
        this.GPA = aGPA;
    }

    public int getNumberOfCredits() {
        return this.numberOfCredits;
    }
    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public Student(String name, int studentId, double GPA, int numberOfCredits) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.GPA = GPA;
    }

}
