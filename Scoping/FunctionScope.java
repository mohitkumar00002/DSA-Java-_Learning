
public class FunctionScope {
    public static void main(String[] args) {
        // Variables declared inside a method Only accessible within that method.
        // System.out.println(localVar);   not accessible;
        show();
    }
    static void show() {
        int localVar = 10; // method scope
        System.out.println(localVar);
    }
    
}
