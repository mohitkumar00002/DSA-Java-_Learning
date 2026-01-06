public class FunctionOverloading {
    public static void main(String[] args) {
        fun(45);
        fun("Java");
    }
    static void fun(int x){
        System.out.println((x));
    }
    static void fun(String x){
        System.out.println(x);
    }
}
