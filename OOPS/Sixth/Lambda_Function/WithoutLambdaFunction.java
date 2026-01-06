package Sixth.Lambda_Function;

interface MyInterface {
    void sayHello();
}

public class WithoutLambdaFunction {
    public static void main(String[] args) {
        // Using Anonymous Class
        MyInterface obj = new MyInterface() {
            public void sayHello() {
                System.out.println("Hello Java");
            }
        };
        obj.sayHello();
    }
}
