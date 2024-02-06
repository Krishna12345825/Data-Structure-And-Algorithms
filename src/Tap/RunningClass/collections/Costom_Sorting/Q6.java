package Tap.RunningClass.collections.Costom_Sorting;

import java.util.*;


class MyCompare2 implements Comparator<Employee6>{

    @Override
    public int compare(Employee6 e1, Employee6 e2) {
       String name1 = e1.getName();
       String name2 = e2.getName();

       int l1 = name1.length();
       int l2 = name2.length();

       if (l1 != l2){
           return l1 - l2;
       }else {
           return name1.compareTo(name2);
       }

    }
}

class MyCompare1 implements Comparator<Employee6> {
    @Override

    public int compare(Employee6 e1, Employee6 e2) {
        String name1 = e1.getName();
        String name2 = e2.getName();


//        return name1.compareTo(name2);

        if (name1.compareTo(name2) != 0){
            return name1.compareTo(name2);
        }else {
            return e1.getId() -  e2.getId();
        }
    }
}

class Employee6 implements Comparable<Employee6> {
    private int id;
    private String name;
    private String department;
    private int salary;

    public Employee6() {
    }

    public Employee6(int id, String name, String department, int salary) {
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

    @Override
    public String toString() {
        return "Employee6{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee6 e2) {
        Employee6 e1 = this;
        int salary1 = e1.salary;
        int salary2 = e2.salary;
        String name1 = e1.name;
        String name2 =e2.name;

        //        if name and salary are same then they will sort based on id  with name  in reverse order and salary in decsing order
        if (salary1 != salary2){
            return salary2 - salary1;
        } else if (name1.compareTo(name2) != 0) {
            return name1.compareTo(name2) * -1;
        }else {
            return e1.id - e2.id;
        }
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyCompare1 compare1 = new MyCompare1();
//        MyCompare2 compare1 = new MyCompare2();
        TreeSet<Employee6> treeSet = new TreeSet<Employee6>();
//        ArrayList<Employee6> treeSet = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String s = sc.next();

            String arr[] = s.split(",");
            int id = 1001 + i;
            String name = arr[0];
            String Department = arr[1];
            int salary = Integer.parseInt(arr[2]);
           Employee6 employee6 = new Employee6(id,name,Department,salary);
           treeSet.add(employee6);
        }

        for (Employee6 emp : treeSet){
            System.out.println(emp);
        }

//        System.out.println("After Sorting");
//        Collections.sort(treeSet);
//        for (Employee6 emp : treeSet){
//            System.out.println(emp);
//        }


//        System.out.println("After Customised Sorting");
//        Collections.sort(treeSet, compare1);
//        for (Employee6 emp : treeSet){
//            System.out.println(emp);
//        }


    }
}

/*

alex,Hr,3000
bob,IT,5000
jack,IT,2000
bob,IT,5000
jack,IT,5000

*/

