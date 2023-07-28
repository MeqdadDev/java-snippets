public class Student {
    private int number;
    private String name;
    private String password;
    private boolean loggedIn;
    private static int count = 1;
    static String college = "IT";
    private static int minPassLength = 6;

    public Student(String name, String password) {
        this.number = count;
        this.name = name;
        this.password = password;
        count++;
    }

    public boolean logIn(int enteredNo, String eneteredPassword) {
        if (enteredNo == number && eneteredPassword.equals(password)) {
            if (Student.validatePassword(eneteredPassword)) {
                loggedIn = true;
            }
        } else {
            loggedIn = false;
        }
        return loggedIn;
    }

    public static boolean validatePassword(String password) {
        return password.length() >= minPassLength;
    }

}
