package exercises.school;
import java.util.ArrayList;

public class CreateStudents {
    public static void main(String[] args) {
        ArrayList<Student> myStudents = new ArrayList<Student>();
        Student Paul = new Student("Paul", 1, 4.0, 25);
        Student Paal = new Student("Paul", 1, 4.0, 25);
        Student Marissa = new Student( "Marissa", 2, 4.0, 35);
        myStudents.add(Paul);
        myStudents.add(Marissa);
        Course myCourse = new Course("Biology", false, 2, myStudents);
        ArrayList<Student> theStudents = myCourse.getStudents();

        theStudents.forEach((student) -> System.out.println(student.getName()));
        Paul.addGrade(4, 1.0);
        System.out.println(Paul.equals(Marissa));
        System.out.println(myCourse.toString());
    }
}
