package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        double radius = input.nextDouble();
        if(radius > 0) {
            double result = Circle.getArea(radius);
            System.out.println("The area of a circle of radius " + radius + " is: " + result);
        }
        else {
            System.out.println("Please enter an positive number.");
        }
        input.close();

    }

}
