public class Swapping {
    public static void main(String[] args) {
        
        // Example 1: Primitives (int)
        int a = 10;
        int b = 20;
        swapPrimitives(a, b); // Doesn't work
        System.out.println("After swapPrimitives: a = " + a + ", b = " + b);

        // Example 2: Wrapper Classes (Integer)
        Integer p = 10;
        Integer q = 15;
        swapWrappers(p, q); // Doesn't work
        System.out.println("After swapWrappers: p = " + p + ", q = " + q);
    }

    // ❌ This will NOT swap values
    // Because Java passes primitive values by value (copies)
    static void swapPrimitives(int x, int y) {
        int temp = x;
        x = y; 
        y = temp;
    }

    // ❌ This will also NOT swap values
    // Java passes object references by value (copy of reference)
    // And Integer is immutable, so you can't change its internal value
    static void swapWrappers(Integer x, Integer y) {
        Integer temp = x;
        x = y; 
        y = temp;
    }
}
