package LAB6;

import java.util.ArrayList;
import java.util.List;

public class ExtractDigitCharacter2 {
    public static void main(String[] args) {
        String myFirstStr = "100 minutes";
        String mySecondStr = "12345abcd6789";
        char [] myFirstChar = myFirstStr.toCharArray();
        ArrayList<Character> listFirst = new ArrayList<>();
        for (char characterListFirst : myFirstChar) {
            if (Character.isDigit(characterListFirst)){
                listFirst.add(characterListFirst);
            }
        }

        char [] mySecondChar = mySecondStr.toCharArray();
        ArrayList<Character> listSecond = new ArrayList<>();
        for (char characterListSecond : mySecondChar) {
            if (Character.isDigit(characterListSecond)){
                listSecond.add(characterListSecond);
            }
        }

        System.out.println(listFirst);
        System.out.println(listSecond);
        
    }
}
