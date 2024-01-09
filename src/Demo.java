import java.util.*;
class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private String department;
    private int saalary;

  public Employee(int id, String name, String department, int saalary){
      this.id = id;
      this.name = name;
      this.department = department;
      this.saalary = saalary;
  }

  public int getId(){
      return id;
  }
  public String getName(){
      return name;
  }
  public String getDepartment(){
      return department;
  }
  public int getSaalary(){
      return saalary;
  }

  public int compareTo(Employee e2){
      Employee e1 = this;
      int saalary1 = e1.saalary;
      int salary2 = e2.saalary;
      return salary2 - saalary1;
  }
}


class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<Employee> employeeTreeSet = new TreeSet<>();
        int n  = scanner.nextInt();
        for(int i = 0; i<n; i++){
            String s = scanner.next();
            String arr[] = s.split(",");
            int id = 1001+i;
            String name = arr[0];
            String department = arr[1];
            int salary = Integer.parseInt(arr[2]);
            Employee employee = new Employee(id, name, department, salary);
            employeeTreeSet.add(employee);
        }

        for (Employee employee : employeeTreeSet){
            System.out.println(employee.getId()+","+employee.getName()+","+employee.getDepartment()+","+employee.getSaalary());
        }
    }




}


