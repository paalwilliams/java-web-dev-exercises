package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        String radStr = input.nextLine();
        while(true) {
            try {
                double radius = Double.parseDouble(radStr);
                if(radius < 0.0) {
                    System.out.print("Please enter a positive number: \n");
                    input.nextLine();
                }
                else {
                    double result = Circle.getArea(radius);
                    System.out.println(result);
                    input.close();
                    break;

                }

            } catch(Exception err) {
                System.out.println("Please enter a number, not a string: \n");
                input.nextLine();
            }
            }
        }


    }
