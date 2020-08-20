package exercises;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<String, Integer> students = new HashMap<String, Integer>();
        Scanner input = new Scanner(System.in);
        String newStudent;
        do{
            System.out.println("Student: ");
            newStudent = input.nextLine();
            if(!newStudent.equals("")) {
                System.out.println("Student ID Number: ");
                Integer idNum = input.nextInt();
                students.put(newStudent, idNum);
            }
            input.nextLine();
        } while(!newStudent.equals(""));

        System.out.println("\nClass Roster:");

        for(Map.Entry<String, Integer> student : students.entrySet()) {
            System.out.println(student.getKey() + " ID Number: " + student.getValue());
        }
    }
}
