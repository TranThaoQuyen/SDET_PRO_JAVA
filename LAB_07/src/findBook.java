import LAB7.infoBook;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class findBook {
    public static void main(String[] args) {
        Map<Integer, infoBook> listBook = new HashMap<>();
        boolean isContinuing = true;
        while (isContinuing){
            System.out.println("======Menu=======");
            System.out.println("1. Input information of your book.");
            System.out.println("2. Find your book.");
            System.out.println("3. Print your book.");
            System.out.println("4. Exist!");

            Scanner option = new Scanner(System.in);
            System.out.println("Please input your option:");
            int userOption = option.nextInt();
            if (userOption == 0){
                System.out.println("Incorrect option. Please input your option again!!!");
            }else {
                switch (userOption){

                    case 1:
                        System.out.println("Please input ISBN:");
                        Scanner ISBN = new Scanner(System.in);
                        int numISBN = ISBN.nextInt();


                        System.out.println("Please input author name:");
                        Scanner name = new Scanner(System.in);
                        String authorName = name.next();

                        System.out.println("Please input year:");
                        Scanner year = new Scanner(System.in);
                        String bookYear = name.next();

                        listBook.put(numISBN, new infoBook(authorName, bookYear));
                        break;

                    case 2:
                        System.out.println("Please input ISBN you want to find:");
                        Scanner findNumber = new Scanner(System.in);
                        int findISBN = findNumber.nextInt();
                        System.out.println("Result:");
                        System.out.println(listBook.get(findISBN));
                        break;

                    case 3:
                        System.out.println(listBook);
                        break;
                    case 4:
                        System.out.println("Thank you!");
                        isContinuing = false;
                        break;
                }
            }
        }

    }
}
