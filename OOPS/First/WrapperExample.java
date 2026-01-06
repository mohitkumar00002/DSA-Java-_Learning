public class WrapperExample {
    public static void main(String[] args) {
        // 1. Boxing
        int a = 5;
        Integer boxedA = Integer.valueOf(a);
        System.out.println("Boxed: " + boxedA);

        // 2. Unboxing
        Integer boxedB = Integer.valueOf(10);
        int b = boxedB.intValue();
        System.out.println("Unboxed: " + b);

        // 3. Auto-boxing
        int x = 15;
        Integer autoBoxed = x; // compiler adds Integer.valueOf(x)
        System.out.println("Auto-boxed: " + autoBoxed);

        // 4. Auto-unboxing
        Integer autoUnboxObj = 25; // auto-boxing here
        int y = autoUnboxObj;      // compiler adds autoUnboxObj.intValue()
        System.out.println("Auto-unboxed: " + y);
    }
}
