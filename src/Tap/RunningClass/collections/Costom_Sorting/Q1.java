package Tap.RunningClass.collections.Costom_Sorting;

import java.util.ArrayList;
import java.util.Scanner;

/*
garbej collector :- when they is no referance for a object
* */

class  Employee{
    private int id;
    private String name;
    private String department;
    private int salary;

    public Employee() {
    }

    public Employee(int id, String name, String department, int salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}
public class Q1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Employee> employeeList = new ArrayList<Employee>();
            int n = scanner.nextInt();

        for (int i = 0; i<n ; i++) {
            String s = scanner.next();
            String []arr = s.split(",");

            int id = 1001 + i;
            String name = arr[0];
            String department = arr[1];
            int salary = Integer.parseInt(arr[2]);

            Employee e = new Employee(id, name, department, salary);
            employeeList.add(e);
        }

        for (Employee emp : employeeList){
            System.out.println(emp.getId() + ", " + emp.getName() + ","+ emp.getDepartment() + "," + emp.getSalary());
        }
    }
}


//alex,Hr,3000
//bob,IT,5000
//Jack,IT,3999