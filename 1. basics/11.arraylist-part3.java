import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(10, 20, 30));

        System.out.println(l1.contains(10));

        ArrayList<Integer> l2 = new ArrayList<>(Arrays.asList(15, 5, 20, 10));
        l2.retainAll(l1); // It keeps the matched items, remove other items
        l2.retainAll(Arrays.asList(5, 25, 35)); // It keeps the matched items, remove other items
        System.out.println(l2);

        ArrayList<Integer> l3 = new ArrayList<>(l1.subList(0, 2)); // index 2 not included
        System.out.println(l3);

        System.out.println(l2.isEmpty());

        l3.clear();
        System.out.println(l3);
        System.out.println(l3.isEmpty());

        ArrayList<Integer> l4 = new ArrayList<>(100); // pre-allocating memory for 100 locations for initialization
        l4.ensureCapacity(300); // pre-allocating memory 100 location during runtime
        // ensureCapacity: Ensures that the ArrayList can hold at least 100 elements
        // without resizing.

        l3.trimToSize(); // it clears the unused pre-allocated locations in memory

        l2.forEach(el -> System.out.print(el + " >> "));

        Collections.sort(l2); // Ascending
        System.out.println(l2);

        l1.sort(Collections.reverseOrder());
        // OR....
        // Collections.sort(l1, Collections.reverseOrder());

        System.out.println(l1);

        Collections.reverse(l2);
        System.out.println(l2);

        System.out.println(Collections.max(l1));
        System.out.println(Collections.min(l2));

    }
}