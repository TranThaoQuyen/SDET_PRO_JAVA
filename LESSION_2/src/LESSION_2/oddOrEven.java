package LESSION_2;
import java.util.Scanner;
public class oddOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please input your number: ");
        String x = scanner.nextLine();
        int number = Integer.parseInt(x);
        if( number%2==0) {
            System.out.println("Your number is Odd number");
        } else {
            System.out.println("Your number is Even number");
        }
    }
}
