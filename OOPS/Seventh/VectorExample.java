import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        // Create a Vector
        Vector<String> names = new Vector<>();

        // Add elements
        names.add("Mohit");
        names.add("Amit");
        names.add("Sumit");
        names.add("Mohit"); // duplicate allowed

        // Display Vector
        System.out.println("Vector: " + names);

        // Get element
        System.out.println("First element: " + names.get(0));

        // Remove element
        names.remove("Amit");
        System.out.println("After removal: " + names);

        // Check size
        System.out.println("Size: " + names.size());
    }
}
