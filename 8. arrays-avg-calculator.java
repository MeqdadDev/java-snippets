import java.util.Scanner;

public class Firstproject {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int arr[] = new int[5];
        for (int j = 0; j < arr.length; j++) {
            System.out.printf("Enter number" + (j + 1) + " = ");
            arr[j] = in.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Arr = " + arr[i]);
            sum += arr[i];
        }

        System.out.println("Sum = " + sum);

        double avg = sum / arr.length;
        System.out.println("Avg = " + avg);

    }
}
