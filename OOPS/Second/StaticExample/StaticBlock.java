package Second.StaticExample;

public class StaticBlock {
    public static void main(String[] args) {
        System.out.println(Example.b);
    }
    class Example{
        static int a = 5;
        static int b;
        static {
            System.out.println("Static Block Executed");
            b = a*3;
        }
    }
}
