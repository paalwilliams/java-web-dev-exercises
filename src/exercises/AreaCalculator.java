package exercises;
import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the rectangle's width: ");
        int width = input.nextInt();
        System.out.println("Please enter the rectangles height: ");
        int height = input.nextInt();
        int area = width * height;
        input.close();
        System.out.println("Area = " + area);

    }
}
