package LAB6;

public class ExtractDigitCharacter {
    public static void main(String[] args) {
        String myFirstStr = "100 minutes";
        String newString = myFirstStr.substring(0,3);
        System.out.println(newString);

        String mySecondStr = "12345abcd6789";
        String mySecondStr01 = mySecondStr.substring(0,5);
        String mySecondStr02 = mySecondStr.substring(9);
        String myNewSecondStr = mySecondStr01 + mySecondStr02;

        System.out.println(mySecondStr01);
        System.out.println(mySecondStr02);
        System.out.println(myNewSecondStr);
    }
}
