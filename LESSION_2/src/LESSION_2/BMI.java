package LESSION_2;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input your height: ");
        double height = scanner.nextDouble();

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Please input your weight : ");
        double weight = scanner.nextDouble();

        double BMI = weight/(height * 2);

        if (BMI >= 30) {
            System.out.println("Obesity");
            double weightNormal = 24.9*height*2;
            double weightDecrease = weight - weightNormal ;
            System.out.printf("You should decrease: %f kg", weightDecrease);

        } else if (BMI <= 18.5) {
            System.out.println("Under weight");
            double weightNormal = 19*height*2;
            double weightIncrease = weightNormal - weight;
            System.out.printf("You should increase: %f kg", weightIncrease);
        } else if (BMI <= 24.9) {
            System.out.println("Normal weight");
            System.out.println("Wow! You are perfect..!");
        } else {
            System.out.println("Over weight");
            double weightNormal = 24.9*height*2;
            double weightDecrease = weight - weightNormal ;
            System.out.printf("You should decrease: %f kg", weightDecrease);
        }
    }
}
