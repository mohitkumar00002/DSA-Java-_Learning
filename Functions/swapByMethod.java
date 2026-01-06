// 1. Primitive Types (int, byte, char, boolean, float, etc.)
// 👉 Pass-by-value of the actual value

// Means: a copy of the value is passed to the method. Changes inside the method do not affect the original.

// Example:


public class swapByMethod {
    public static void main(String[] args) {
        byte a = 15;
        byte b = 30;

        swap(a,b);
        System.out.println(a);
        System.out.println(b);
    }
    static void swap(byte x, byte y){
        byte temp = x; 
        x = y;
        y = temp;
        // System.out.println("After swap: x = " + x + ", y = " + y);
    }
}
