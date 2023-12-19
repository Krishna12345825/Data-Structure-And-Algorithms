import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private String department;
    private int salary;

    public Employee(int id, String name, String department, int salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Employee e2) {
        Employee e1 = this;
        int salary1 = e1.salary;
        int salary2 = e2.salary;
        String name1 = e1.name;
        String name2 = e2.name;

        return salary2 - salary1;
    }
}

class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      TreeSet<Employee>  employees = new TreeSet<Employee>();
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            String s = scanner.next();
            String arr[] = s.split(",");
            int id = 1001 + i;
            String name = arr[0];
            String department = arr[1];
            int salary = Integer.parseInt(arr[2]);
            Employee emp = new Employee(id, name, department, salary);
            employees.add(emp);
        }

        for (Employee employee : employees){
            System.out.println(employee.getId() + "  " + employee.getName() + "  " + employee.getDepartment() + "  " + employee.getSalary());
        }

    }
}
/*

alex,IT,3000
bob,IT,5000
Jack,IT,3999
*/
