package Second.StaticExample;

public class StaticMethod {
    public class MathUtil {
        static int square(int x) {
            return x * x;
        }
    }
    public static void main(String[] args) {
        System.err.println(MathUtil.square(5));
    }

}