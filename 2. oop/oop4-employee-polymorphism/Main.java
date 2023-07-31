import OOP.DailyEmployee;
import OOP.Employee;
import OOP.HourlyEmployee;
import OOP.SalariedEmployee;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Meqdad", "Ramallah", "IT", "meqdad@mail.com", 1300);
        System.out.println("Salary1 = " + e1.getSalary());

        SalariedEmployee e2 = new SalariedEmployee("Meqdad", "Ramallah", "IT", "meqdad@mail.com", 1300, 100);
        System.out.println("Salary2 = " + e2.getSalary());

        DailyEmployee e3 = new DailyEmployee("Meqdad", "Ramallah", "IT", "meqdad@mail.com", 1300, 100, 15);
        System.out.println("Salary3 = " + e3.getSalary());

        HourlyEmployee e4 = new HourlyEmployee("Meqdad", "Ramallah", "IT", "meqdad@mail.com", 1300, 10, 10);
        System.out.println("Salary4 = " + e4.getSalary());
    }
}