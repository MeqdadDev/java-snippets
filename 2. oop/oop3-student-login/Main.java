public class Main {

    public static void main(String[] args) {
        Student s1 = new Student("Meqdad", "123456");
        Student s2 = new Student("Ahmad", "345");
        // System.out.println(Student.college);
        // System.out.println(s1.college);

        System.out.println(s1.logIn(1, "123456"));
        System.out.println(s2.logIn(2, "345"));

    }
}
