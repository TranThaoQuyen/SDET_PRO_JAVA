package Bai01;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SalaryCalculator {
    int getTotalSalary(List<Employee> employeeList){
        int totalSalary = 0;
        for (Employee employee : employeeList) {
            totalSalary = totalSalary + employee.getSalary();
        }
        return totalSalary;
    }

    public static void main(String[] args) {
        Employee fullTimeEmployee = new FTE();
        Employee contractEmployee = new Contractor();

        List<Employee> employeeList = new ArrayList<>();
        System.out.println("Please input number of fullTimeEmployee at company");
        Scanner fEmployee = new Scanner(System.in);
        int numberFullTimeEmployee = fEmployee.nextInt();
        for (int i=0; i<numberFullTimeEmployee; i++){
            employeeList.add(new FTE());
        }
        System.out.println("Please input number of contractEmployee at company");
        Scanner cEmployee = new Scanner(System.in);
        int numberContractEmployee = fEmployee.nextInt();
        for (int i=0; i<numberContractEmployee; i++){
            employeeList.add(new Contractor());
        }

        int totalSalary = new SalaryCalculator().getTotalSalary(employeeList);

        System.out.println("Total salary of company:" + totalSalary);
    }
}
