package Bai1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculateTotalSalary {
    public static void main(String[] args) {
        Employee fullTimeEmployee = new FullTimeEmployee();
        Employee contractEmployee = new ContractEmployee();

        contractEmployee.setEmployeeSalary(40000);
        fullTimeEmployee.setEmployeeSalary(50000);

        contractEmployee.setEmployeeName("Contract Employee");
        fullTimeEmployee.setEmployeeName("Full time Employee");

        System.out.println(contractEmployee.getEmployeeName());
        System.out.println(contractEmployee.salary());

        System.out.println(fullTimeEmployee.getEmployeeName());
        System.out.println(fullTimeEmployee.salary());

        List<Employee> company = new ArrayList<>();
        System.out.println("Please input number of fullTimeEmployee at company");
        Scanner fEmployee = new Scanner(System.in);
        int numberFullTimeEmployee = fEmployee.nextInt();
        System.out.println("Please input number of contractEmployee at company");
        Scanner cEmployee = new Scanner(System.in);
        int numberContractEmployee = fEmployee.nextInt();

        int totalSalary = (numberContractEmployee*40000)+(numberFullTimeEmployee*50000);

        System.out.println("Total salary of company:" + totalSalary);

    }
}
