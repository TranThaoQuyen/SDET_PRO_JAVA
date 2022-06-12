package LAB4;

import java.util.ArrayList;
import java.util.Scanner;

public class SimpleMenu {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();

        boolean isContinuing = true;
        while (isContinuing){
            System.out.println("=========MENU=========");
            System.out.println("1. Add number into list");
            System.out.println("2. Print number");
            System.out.println("3. Get maximum number");
            System.out.println("4. Get minimum number");
            System.out.println("5. Exit");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Please input your number: ");
            int userInput = scanner.nextInt();

            if (userInput==0){
                isContinuing = false;
                System.out.println("Thank you");
            }else{
                switch (userInput){
                    case 1:
                        Scanner scan = new Scanner(System.in);
                        System.out.println("1. Add number into list");
                        arrList.add(scan.nextInt());
                        break;
                    case 2:
                        System.out.println("2. Print number of list");
                        for (Integer value: arrList){
                            System.out.println(value);
                        }
                        break;
                    case 3:
                        System.out.println("3. Get maximum number");
                        int maxiNumber = arrList.get(0);
                        for (int index = 1;index<arrList.size();index++){
                            if (maxiNumber < arrList.get(index)){
                                maxiNumber = arrList.get(index);
                            }
                        }
                        System.out.println(maxiNumber);
                        break;
                    case 4:
                        System.out.println("4. Get minimum number");
                        int miniNumber = arrList.get(0);
                        for (int index = 1;index<arrList.size();index++){
                            if (miniNumber > arrList.get(index)){
                                maxiNumber = arrList.get(index);
                            }
                        }
                        System.out.println(miniNumber);
                        break;
                    case 5:
                        System.out.println("5. Exit");
                        break;
                    default:
                        System.out.println("Wrong option");

                }
            }


        }
    }
}
