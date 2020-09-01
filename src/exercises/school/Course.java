package exercises.school;
import java.util.ArrayList;

public class Course {

    private String title;
    private boolean preReqsRequired;
    private int credits;
    private ArrayList<Student> students;

    public Course(String title, boolean preReqsRequired, int credits, ArrayList<Student> students) {
        this.title = title;
        this.preReqsRequired = preReqsRequired;
        this.credits = credits;
        this.students = students;
    }

    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public boolean getPreReqsRequired() {
        return this.preReqsRequired;
    }

    public void setPreReqsRequired(boolean preReqsRequired) {
        this.preReqsRequired = preReqsRequired;
    }

    public int getCredits() {
        return this.credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public ArrayList<Student> getStudents() {
        return this.students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public boolean equals(Course myCourse) {
        if(this.title.equals(myCourse.title)) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + title + '\'' +
                ", preReqsRequired=" + preReqsRequired +
                ", credits=" + credits +
                ", students=" + students +
                '}';
    }
}
