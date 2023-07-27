import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

        Scanner ui = new Scanner(System.in); // User input

        System.out.print("Enter your name: ");
        String name = ui.next(); // next for word, nextLine for multi-words
        System.out.print("Hello " + name);

        System.out.print("Enter number 1 = ");
        float n1 = ui.nextFloat();

        System.out.print("Enter number 2 = ");
        float n2 = ui.nextFloat();

        System.out.print("Select your operation: + for addition, - for subtraction");

        char operation = ui.next().charAt(0);

        float result = 0f;

        if (operation == '+') {
            result = n1 + n2;
        }
        if (operation == '-') {
            result = n1 - n2;
        }

        System.out.printf("Result = %.1f", result);

        // Other shortcuts to use with printf

        /*
         * d : [byte, short, int, long]
         * f : [float, double]
         * cC: character Capital C will uppercase the letter
         * sS: String Capital S will uppercase all the letters in the string
         * n : newline
         */

    }
}
