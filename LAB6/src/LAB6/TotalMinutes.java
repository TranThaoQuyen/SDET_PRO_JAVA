package LAB6;

import java.util.Scanner;

public class TotalMinutes {
    public static void main(String[] args) {
        String time = "2hrs and 5 minutes";
        String hours = time.substring(0,4);
        String minutes = time.substring(9);

        String myHours = hours.replaceAll("[^0-9]","");
        String myMinutes = minutes.replaceAll("[^0-9]","");

        int hrs = Integer.parseInt(myHours);
        int mns = Integer.parseInt(myMinutes);

        int totalMinute = hrs*60 + mns;

        System.out.println("Your total minutes is:" + totalMinute);

    }
}
