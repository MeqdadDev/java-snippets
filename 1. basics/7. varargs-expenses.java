import java.util.Scanner;

public class Firstproject {

    public static float CalcExpenses(float... e) {
        float total = 0f;
        for (float i : e) {
            total += i;
        }

        return total;

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Expenses Calculator");
        System.out.println("Enter your expenses for this month: ");

        System.out.print("Rent = ");
        float e1 = input.nextFloat();

        System.out.print("Electricity = ");
        float e2 = input.nextFloat();

        float result1 = CalcExpenses(e1, e2);

        System.out.println("Total for now = " + result1 + "$");

        System.out.print("Internet = ");
        float e3 = input.nextFloat();

        float result2 = CalcExpenses(e1, e2, e3);

        System.out.println("Total for now = " + result2 + "$");

    }
}
