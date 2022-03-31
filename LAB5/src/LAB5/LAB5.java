package LAB5;

import java.util.Scanner;

import java.util.HashMap;
import java.util.Map;

public class LAB5 {
    public static void main(String[] args) {
        Map<Integer, String> infoStudent = new HashMap<>();
        boolean isContinuing = true;
        while (isContinuing){
            System.out.println("------Menu-------");
            System.out.println("1.Input information of student");
            System.out.println("2.Find student ID");
            System.out.println("3.Exit!!!");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Please input your option:");
            int userInput = scanner.nextInt();
            if (userInput == 0){
                isContinuing = false;
                System.out.println("Wrong option!!");
            }else{
                switch (userInput){
                    case 1:
                        System.out.println("Please input information of student");

                        Scanner studentID = new Scanner(System.in);
                        System.out.println("Please input Student ID");
                        int ID = studentID.nextInt();

                        Scanner studentName = new Scanner(System.in);
                        System.out.println("Please input name of student");
                        String name = studentName.nextLine();
                        infoStudent.put(ID, name);
                        break;

                    case 2:
                        System.out.println("Please input student ID");
                        Scanner infoID = new Scanner(System.in);
                        int infoFind = scanner.nextInt();
                        System.out.println("Result:");
                        System.out.println(infoStudent.get(infoFind));
                        break;
                    case 3:
                        System.out.println("Thank you!");
                        isContinuing = false;
                        break;
                }
            }
        }

    }
}
