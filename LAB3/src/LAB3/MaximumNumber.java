package LAB3;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        int elementMax = 0;
        int intArrMax = 0 ;

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
            if (intArr [i] > elementMax ){
                elementMax = intArr[i];
                intArrMax = i;
            }
        }

        System.out.printf("Maximum number is %d at intArr[%d]", elementMax,intArrMax);

    }
}
