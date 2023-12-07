package Tap.RunningClass.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;

class Employee1{
    private int id;
    private String name;
    private String Department;
    private int Salary;

    public Employee1() {
    }

    public Employee1(int id, String name, String department, int salary) {
        this.id = id;
        this.name = name;
        Department = department;
        Salary = salary;
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
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }
}
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        LinkedList<Employee1>  employee1s= new LinkedList<Employee1>();
//        HashSet<Employee1> employee1s = new HashSet<Employee1>();
        LinkedHashSet<Employee1> employee1s = new LinkedHashSet<>();

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            String arr[] =  s.split(",");
            int id = 1001 + i;
            String name =  arr[0];
            String Department = arr[1];
            int salary = Integer.parseInt(arr[2]);
            Employee1 employee1 = new Employee1(id,name, Department, salary);
            employee1s.add(employee1);
        }
        for (Employee1 emp : employee1s){
            System.out.println(emp.getId() + ", " + emp.getName() + ","+ emp.getDepartment() + "," + emp.getSalary());
        }
    }
}


//alex,Hr,3000
//bob,IT,5000
//Jack,IT,3999