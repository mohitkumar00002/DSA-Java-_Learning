// 2. Objects and Arrays
// 👉 Still pass-by-value — but the value is a reference

// You're passing a copy of the reference to the object. So if you change the object's internal state → it's reflected outside. But if you reassign the reference → no effect outside.

// Example:

import java.util.Arrays;

public class ArrayChange {
    public static void main(String[] args) {
        int[] arr = {1,23,4,5,6,76};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int []arr){
        arr[0] = 100;
    }
    
}
