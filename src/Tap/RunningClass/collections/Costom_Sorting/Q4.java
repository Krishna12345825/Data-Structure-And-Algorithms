package Tap.RunningClass.collections.Costom_Sorting;

import java.util.Scanner;
import java.util.TreeSet;

class Employee4 implements  Comparable<Employee4>{
    private int id;
    private String name;
    private String Department;
    private int Salary;

    public Employee4() {
    }

    public Employee4(int id, String name, String department, int salary) {
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


//    @Override
//    public String toString() {
//        return "Employee4{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", Department='" + Department + '\'' +
//                ", Salary=" + Salary +
//                '}';
//    }



    @Override
    public int compareTo(Employee4 e2) {
        Employee4 e1 = this;
        int sal1 = e1.Salary;
        int sal2 = e2.Salary;

        return sal1 - sal2;

//        return sal2 - sal1;

//        if (sal1 == sal2 ){
//            return 0;
//        } else if (sal1 < sal2) {
//            return -1;
//        }else {
//            return 1;
//        }

    }



}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Employee4> treeSet = new TreeSet<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            String ar[] = s.split(",");
            int id = 100 + i;
            String name = ar[0];
            String department = ar[1];
            int salary = Integer.parseInt(ar[2]);

            Employee4 employee4 = new Employee4(id, name, department, salary);
            treeSet.add(employee4);
        }
//        for (Employee4 employee4 : treeSet){
//            System.out.println(employee4);
//        }

        for(Employee4 employee4 : treeSet){
            System.out.println(employee4.getId() + " " + employee4.getName() + " " + employee4.getDepartment() +" " + employee4.getSalary());
        }
    }

}
