/*
 * sout+tab -> System.out.print
*/

public class Firstproject {

    public static void main(String[] args) {
        int age = 25;
        short k = 14; // 16-bit
        byte x = 127; // 8-bit: -128 -> 127
        byte bintodec = 0b1111111;
        float currency = 3.73f;
        double area = 3432.12343456d; // or use f at the end
        long population = 1234564323;
        char gender = 'M';
        boolean readiness = true;
        String name = "Meqdad 'Dev'";
        System.out.println(age);
        System.out.println(name);
        System.out.println(x);
        System.out.println(bintodec);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(currency);
        System.out.println(population);
        System.out.println(area);
        System.out.println(gender);
        System.out.println(readiness);

        // Casting
        System.out.println((float) x / 2);

    }
}
