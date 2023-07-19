import java.util.Scanner;

public class Firstproject {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a day: ");
        String day = input.next().toLowerCase();

        switch (day) {

            case "saturday":
                System.out.println("Weekend");
                break;

            case "sunday":
                System.out.println("Work day");
                break;

            case "monday":
                System.out.println("Work day");
                break;

            case "tuesday":
                System.out.println("Work day");
                break;

            case "wednesday":
                System.out.println("Work day");
                break;

            case "thursday":
                System.out.println("Work day");
                break;

            case "friday":
                System.out.println("Weekend");
                break;

            default:
                System.out.println("Not a day");
        }

    }
}
