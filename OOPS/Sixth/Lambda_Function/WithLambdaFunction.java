package Sixth.Lambda_Function;

interface MyInterface {
    void sayHello();
}

public class WithLambdaFunction {
    public static void main(String[] args) {
        // Using Anonymous Class
        MyInterface obj = () -> System.out.println("Hello, How are you?");
        obj.sayHello();
    }
}

