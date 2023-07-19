import java.util.Scanner;

public class Firstproject {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // for (int i = 0; i<= number; i++) {
        // System.out.println(i);
        // }

        for (int i = 0, j = 5; i <= 5 && j >= 0; i++, j--) {
            System.out.println("i= " + i + ",  j= " + j);
        }

    }
}
