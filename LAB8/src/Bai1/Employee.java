package Bai1;

public class Employee {
    private int employeeSalary;
    private String employeeName;

    public Employee() {
    }

    public Employee(int employeeSalary, String employeeName) {
        this.employeeSalary = employeeSalary;
        this.employeeName = employeeName;
    }

    public int getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(int employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int salary(){
        return employeeSalary;
    }

}
