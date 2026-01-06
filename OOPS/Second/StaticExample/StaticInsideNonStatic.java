package Second.StaticExample;

public class StaticInsideNonStatic {

    static int count = 0; // Static variable (shared by all objects)

    // Non-static method
    public void incrementCount() {
        count++; // using static variable inside non-static method
        System.out.println("Count is now: " + count);
    }

    public static void main(String[] args) {
        StaticInsideNonStatic obj1 = new StaticInsideNonStatic();
        StaticInsideNonStatic obj2 = new StaticInsideNonStatic();

        obj1.incrementCount(); // Count: 1
        obj2.incrementCount(); // Count: 2
    }
}
