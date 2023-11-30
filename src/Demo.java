import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Demo {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        Employee employee = new Employee(1, "Krihna ", "krishna@gmail.com", 1200);
        Employee employee1 = new Employee(2, "Rahul", "rahul@gmail.com", 12300);
        Employee employee2 = new Employee(3, "Manish", "manish@gmail.com", 245);


        employeeList.add(employee);
        employeeList.add(employee1);
        employeeList.add(employee2);

        for(Employee employees : employeeList){
            System.out.println(employees);
        }

     }
    }
    class Employee{
    int id;
    String name;
    String email;
    int salary;

        public Employee(int id, String name, String email, int salary) {
            this.id = id;
            this.name = name;
            this.email = email;
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

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", email='" + email + '\'' +
                    ", salary=" + salary +
                    '}';
        }
    }






