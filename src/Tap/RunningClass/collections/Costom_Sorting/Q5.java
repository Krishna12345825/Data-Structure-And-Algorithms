package Tap.RunningClass.collections.Costom_Sorting;

import java.util.Scanner;
import java.util.TreeSet;

class Employee5 implements  Comparable<Employee5>{
    private int id;
    private String name;
    private String Department;
    private int Salary;

    public Employee5() {
    }

    public Employee5(int id, String name, String department, int salary) {
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


    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Department='" + Department + '\'' +
                ", Salary=" + Salary +
                '}';
    }


    @Override
    public int compareTo(Employee5 e2) {
        Employee5 e1 = this;
        int salry1 = e1.Salary;
        int salary2 = e2.Salary;
        String name1 = e1.name;
        String name2 =e2.name;

////        if salary and name are same in accending order then they will sort based on id
//        if (salry1 != salary2){
//            return salry1 - salary2;
//        }else if (name1.compareTo(name2) != 0){
//            return name1.compareTo(name2);
//        }else {
//            return e1.id - e2.id;
//        }


//        if name and salary are same then they will sort based on id  with name  in reverse order and salary in decsing order
        if (salry1 != salary2){
            return salary2 - salry1;
        } else if (name1.compareTo(name2) != 0) {
            return name1.compareTo(name2) * -1;
        }else {
            return e1.id - e2.id;
        }

    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TreeSet<Employee5> treeSet = new TreeSet<Employee5>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            String ar[] = s.split(",");
            int id = 100 + i;
            String name = ar[0];
            String department = ar[1];
            int salary = Integer.parseInt(ar[2]);

            Employee5 employee5 = new Employee5(id, name, department, salary);
            treeSet.add(employee5);
        }

        for (Employee5 employee5 : treeSet){
            System.out.println(employee5);
        }
    }

}


//name and salary are same so that they are sorting based on id

/*

alex,Hr,3000
bob,IT,5000
Jack,IT,7000
jill,IT,5000
bob,HR,5000
*/
