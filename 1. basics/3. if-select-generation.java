import java.util.Scanner;

public class Firstproject {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Your name: ");
        String name = input.nextLine();
        System.out.printf("%nHello %s %n", name);

        System.out.print("Birth Year: ");
        int yob = input.nextInt();

        if ((yob >= 1981) && (yob <= 1996)) {
            System.out.println("Millennials Generation");
        } else if ((yob >= 1997) && (yob <= 2010)) {
            System.out.println("Generation Z");
        } else if (yob >= 2011) {
            System.out.println("Generation Alpha");
        }

    }
}
