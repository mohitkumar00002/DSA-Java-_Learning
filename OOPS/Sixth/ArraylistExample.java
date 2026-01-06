package Sixth;
import java.util.ArrayList;

public class ArraylistExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // adding elements
        list.add(45);   // index 0
        list.add(50);   // index 1
        list.add(556);  // index 2 (instead of set)

        // accessing elements
        System.out.println("First element: " + list.get(0));
        System.out.println("Third element: " + list.get(2));

        // updating an existing element
        list.set(1, 500); // replaces value at index 1
        System.out.println("Updated list: " + list);
    }
}
