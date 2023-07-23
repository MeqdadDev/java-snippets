import java.util.Scanner;

public class Firstproject {

    public static int FindMin(int num1, int num2, int num3) {
        int min = num1;

        if (num2 < min)
            min = num2;

        min = num3 < min ? num3 : min;

        return min;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number 1 = ");
        int n1 = input.nextInt();

        System.out.print("Enter number 2 = ");
        int n2 = input.nextInt();

        System.out.print("Enter number 3 = ");
        int n3 = input.nextInt();

        int m = FindMin(n1, n2, n3);
        System.out.println("Minimum number = " + m);

    }
}
