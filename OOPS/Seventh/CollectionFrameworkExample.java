import java.util.*;

public class CollectionFrameworkExample {
    public static void main(String[] args) {
        // Example of List
        List<String> names = new ArrayList<>();
        names.add("Mohit");
        names.add("Amit");
        names.add("Mohit"); // duplicate allowed
        System.out.println("List: " + names);

        // Example of Set
        Set<Integer> rollNumbers = new HashSet<>();
        rollNumbers.add(101);
        rollNumbers.add(102);
        rollNumbers.add(101); // duplicate not allowed
        System.out.println("Set: " + rollNumbers);

        // Example of Map
        Map<Integer, String> students = new HashMap<>();
        students.put(1, "Mohit");
        students.put(2, "Amit");
        students.put(3, "Sumit");
        System.out.println("Map: " + students);
    }
}
