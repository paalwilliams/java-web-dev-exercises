package exercises;
import java.util.Scanner;

public class MPGCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        int miles = input.nextInt();
        System.out.println("How many gallons of gas have you consumed? ");
        int gas = input.nextInt();
        float mpg = (float) miles / (float)gas;
        input.close();
        System.out.println("Your fuel effiiency is " + mpg + "MPG");
    }
}
