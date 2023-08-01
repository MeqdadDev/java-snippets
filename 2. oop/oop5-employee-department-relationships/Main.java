import OOP.Department;
import OOP.Employee;

public class Main {
    public static void main(String[] args) {
        Department dept = new Department(123, "IT");
        Employee emp = new Employee(1, 1000, "Meqdad", "Ashraf", "Mohammad", "A+", "5432", "Palestinian", 2005, dept);
        System.out.println(emp); // same as below (it calls toString by default)
        System.out.println(emp.toString());

    }
}