package exercises;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
//      Step 1 Part 1
        int[] myInts = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        ArrayList<Integer> myIntArrList = new ArrayList<Integer>();
        for(int i = 0; i < myInts.length; i++) {
            myIntArrList.add(myInts[i]);
        }
//      Step 1 Part 2
        getSumOfEven(myIntArrList);

//      Step 2 Part 1
        String[] myStringArr = new String[] {"I", "would", "not", "could", "not", "in", "a", "box", "I", "would", "not", "could", "not", "with", "a", "fox", "I", "will", "not", "eat", "them", "in", "a", "house", "I", "will", "not", "eat", "them", "with", "a", "mouse"};
        ArrayList<String> myStringArrList = new ArrayList<String>();
        for(int i = 0; i < myStringArr.length; i++) {
            myStringArrList.add(myStringArr[i]);
        }

        wordSearch(myStringArrList);
    }

//    Part 1
    public static int getSumOfEven(ArrayList<Integer> argArr) {
        int counter = 0;
        for(int i : argArr) {
            if(i % 2 == 0) {
                counter += i;
            }
        }
        return counter;
    }

    public static int wordSearch(ArrayList<String> argArr) {
        Scanner input = new Scanner(System.in);
        int counter = 0;
        int lenSearch = 0;
        do{
            System.out.println("Please enter a word length to search for: \n");
            try {
                lenSearch = input.nextInt();
            }
            catch(Exception err) {
                System.out.println(err);
                continue;
            }

        } while(lenSearch == 0);

        for(String i: argArr) {
            if(i.length() == lenSearch) {
                counter ++;
            }
        }
        System.out.println(counter);
        return counter;

    }
}
