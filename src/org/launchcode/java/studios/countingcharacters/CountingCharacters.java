package org.launchcode.java.studios.countingcharacters;
import java.util.HashMap;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {
        countChars();
    }
    public static HashMap<String, Integer> countChars() {
        Scanner input = new Scanner(System.in);
        String toCheck = "";
        do {
            System.out.println("Enter a string to check the count for each character: ");
            toCheck = input.nextLine();
        } while (toCheck == "");

        HashMap<String, Integer> charCount = new HashMap<String, Integer>();
        for (int i = 0; i < toCheck.length(); i++) {
            Integer count = 0;
            if (charCount.get(String.valueOf(toCheck.charAt(i))) == null) {
                count = 1;

            } else {
                count = charCount.get(String.valueOf(toCheck.charAt(i)));
                count += 1;
            }
            charCount.put(String.valueOf(toCheck.charAt(i)), count);
        }
        charCount.forEach((k, v) -> System.out.println(k + ":" + v));
        return charCount;
    }
}