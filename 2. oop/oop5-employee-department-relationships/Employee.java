package OOP;

public class Employee {
    private int id;
    private float salary;
    private PersonalInformation personalInformation; // Composition relationship (owns/part-of/strong relationship)
    private Department dept; // Aggregation relationship (uses/weak relationship)

    public Employee(int id, float salary, String firstName, String middleName, String lastName, String bloodGroup, String accountNumber, String nationality, int yearOfBirth, Department dept){
        this.id = id;
        this.salary = salary;
        // Inner class below is a composition relationship, i.e. the same lifecycle with Employee class.
        this.personalInformation = new PersonalInformation(firstName, middleName, lastName, bloodGroup, accountNumber, nationality, yearOfBirth);
        this.dept = dept;
    }

    public Employee(int id, float salary, PersonalInformation personalInformation, Department dept) {
        this.id = id;
        this.salary = salary;
        this.personalInformation = personalInformation;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", salary=" + salary +
                ", personalInformation=" + personalInformation +
                ", dept=" + dept +
                '}';
    }
}
