package LAB3;

import java.util.Scanner;

public class CountOddEvenNumber {
    public static void main(String[] args) {
        int evenNumber = 0;
        int oddNumber = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input element Array: ");
        int index = scanner.nextInt();
        int [] intArr = new int[index];
        int elementArray = intArr.length;
        for (int i = 0;i < elementArray;i++){
            System.out.printf("Please input intArr[%d]: ",i);
            Scanner scanner1 = new Scanner(System.in);
            intArr [i] = scanner.nextInt();
        }
        for (int i = 0;i < elementArray;i++){
            if (intArr [i]%2 == 0){
                oddNumber = oddNumber + 1;
            }
        }
        evenNumber = elementArray-oddNumber;

        System.out.printf("Have %d Odd number in your array", oddNumber);
        System.out.printf("\nHave %d Even number in your array", evenNumber);

    }
}
