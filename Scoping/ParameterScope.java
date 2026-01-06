import java.lang.reflect.Method;

public class ParameterScope {
    public static void main(String[] args) {
        // Method parameters are also scoped to the method itself.
        // System.out.println(name); not accessible
    }
    public void greet(String name) {
        System.out.println("Hello, " + name);
    }
    // name is not accessible outside greet()
    
}
