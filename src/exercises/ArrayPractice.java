package exercises;
import java.util.ArrayList;
import java.util.Arrays;

import org.w3c.dom.ls.LSOutput;

public class ArrayPractice {
    public static void main(String[] args) {
//        Array Practice 1
        int[] intArray = new int []{1, 1, 2, 3, 5, 8};

//        Array Practice 2
        for(int i=0; i<intArray.length; i++){
            System.out.println(intArray[i]);
        }

//        Array Practice 3
        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] wordArr = new String[phrase.split(" ").length];
        for(int i = 0; i < wordArr.length; i++) {
            wordArr[i] = phrase.split(" ")[i];
        }
//        Array Practice 4
        System.out.println(Arrays.toString(wordArr));

//        Array Practice 5
        String[] sentenceArr = new String[phrase.split("\\.").length];

        for(int i = 0; i < sentenceArr.length; i++) {
            sentenceArr[i] = phrase.split("\\.")[i];
        }
        System.out.println(Arrays.toString(sentenceArr));
    }
}
