package Tap.RunningClass.collections.Costom_Sorting;

import java.util.LinkedHashSet;
import java.util.Scanner;

class Employee3{
    private int id;
    private String name;
    private String Department;
    private int salary;

    public Employee3(){

    }

    public Employee3(int id, String name, String department, int salary) {
        this.id = id;
        this.name = name;
        Department = department;
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
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

//    @Override
//    public String toString() {
//        return "Employee3{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", Department='" + Department + '\'' +
//                ", salary=" + salary +
//                '}';
//    }


    @Override
    public String toString() {
        return "( "+id + ", " + name + ", " + Department + ", " + salary + " )";
    }
}
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashSet<Employee3> employee3s = new LinkedHashSet<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            String ar[] = s.split(",");
            int id = 10 + i;
            String name = ar[0];
            String department = ar[1];
            int salary = Integer.parseInt(ar[2]);
           Employee3  employee3= new Employee3(id,name,department,salary);
           employee3s.add(employee3);
        }
        for (Employee3 employee3 : employee3s){
            System.out.println(employee3);
        }

    }
}


//alex,Hr,3000
//bob,IT,5000
//Jack,IT,3999