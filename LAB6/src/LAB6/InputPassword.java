package LAB6;

import java.util.Scanner;

public class InputPassword {
    public static void main(String[] args) {
        String myPassword = "password123";

        for (int i = 0; i <3; i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Please input your password");
            String userInput = sc.next();
            if (userInput.equals(myPassword)){
                System.out.println("Congratulations!!! Correct password");
                break;
            }else{
                System.out.println("Incorrect password");
            }
            if (i==2){
                System.out.println("You can only input password 3 times");
            }
        }

    }
}
