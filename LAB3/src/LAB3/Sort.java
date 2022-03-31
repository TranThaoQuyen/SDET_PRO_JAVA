package LAB3;

import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input element Array: ");
        int elementArray = scanner.nextInt();
        int [] intArr = new int[elementArray];
        for (int i = 0;i < intArr.length;i++){
            System.out.printf("Please input intArr[%d]: ",i);
            Scanner scanner1 = new Scanner(System.in);
            intArr [i] = scanner.nextInt();
        }
        int tmp = 0;

        for (int i = 0;i < intArr.length;i++){
            for (int j = 1; j < intArr.length -i; j++){
                if (intArr [j-1] > intArr[j] ){
                    tmp = intArr[j-1];
                    intArr[j-1] = intArr[j];
                    intArr[j] = tmp;
                }
            }

        }

        System.out.println("Array After Bubble Sort");
        for(int i=0; i < intArr.length; i++){
            System.out.print(intArr[i] + " ");
        }

    }
}
