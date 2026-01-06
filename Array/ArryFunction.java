import java.util.Arrays;
import java.util.List;

public class ArryFunction {
    public static void main(String[] args) {
        String[] arr = {"Apple", "Banana", "Mango"};
        List<String> fruits = Arrays.asList(arr);
        System.out.println(fruits);
        fruits.set(1, "Grapes");
        System.out.println(fruits);

        // setAll
        int[] arr2 = new int[5];
        Arrays.setAll(arr2, i->i*i);
        System.out.println(Arrays.toString(arr2));

    }
}
