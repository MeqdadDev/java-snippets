import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // ArrayList list = new ArrayList();
        // OR....
        // ArrayList<Integer> listInt = new ArrayList();
        // OR....
        // ArrayList<Integer> listInt = new ArrayList<>();
        // OR....
        // ArrayList<Integer> listInt = new ArrayList<Integer>();
        // OR....
        // List<Integer> list = new ArrayList<>(); // ok, but you can't use all
        // ArrayList methods

        ArrayList<Integer> list = new ArrayList<>();
        // By default, it starts with size 10 if size not provided.
        list.add(100);
        list.add(200);
        System.out.println(list);

        // traditional for loop
        int s = list.size(); // for better performance
        for (int i = 0; i < s; i++) {
            System.out.println(list.get(i));
        }

        // using for each
        for (int val : list) {
            System.out.println(val);
        }
        // OR....
        // for(Integer val: list){
        // System.out.println(val);
        // }

        list.add(0, 50);
        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(500);
        list2.addAll(list);
        System.out.println("list2 " + list2);

        // addAll accepts list (collection) type, asList helps to add values directly
        list2.addAll(Arrays.asList(600, 700, 800));
        System.out.println("list2 " + list2);

        // Adding at index
        list2.addAll(3, Arrays.asList(5, 6, 7));
        System.out.println("list2 " + list2);

        // Initialize ArrayList with values
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        System.out.println("list3 " + list3);

        // Clone ArrayList
        ArrayList list4;
        // Shallow copy (by value)
        list4 = (ArrayList) list3.clone(); // it needs casting
        System.out.println("list4 " + list4);
    }
}