import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(10, 20, 30));
        System.out.println(l1.get(0));
        l1.set(0, 11);
        System.out.println(l1.get(0));

        ArrayList<Integer> l2 = new ArrayList<>(Arrays.asList(10, 20, 30));
        l2.remove(1); // [10, 30]
        System.out.println(l2);

        ArrayList<Integer> l3 = new ArrayList<>(Arrays.asList(10, 20, 30));
        l3.remove((Integer) 10); // Casting
        // OR...
        l3.remove(Integer.valueOf(20));
        System.out.println("l3 = " + l3);

        ArrayList<String> laptops = new ArrayList<>(Arrays.asList("Dell", "HP", "Asus", "Lenovo", "HP", "Dell"));
        laptops.removeAll(Arrays.asList("HP"));
        laptops.removeAll(Arrays.asList("HP", "Dell"));
        // OR...
        laptops.removeAll(Collections.singleton("HP")); // Single element
        System.out.println("laptops = " + laptops);

        // To use removeRange, it needs to be inherited from ArrayList class.

        ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        list4.removeIf(num -> num % 2 == 0); // Remove even numbers
        System.out.println("list4 = " + list4);

    }
}