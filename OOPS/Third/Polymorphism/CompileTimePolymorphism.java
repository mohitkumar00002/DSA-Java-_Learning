package Third.Polymorphism;

class Calculator {

    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two double values
    double add(double a, double b) {
        return a + b;
    }
}

public class CompileTimePolymorphism {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Sum of 2 integers: " + calc.add(10, 20));
        System.out.println("Sum of 3 integers: " + calc.add(10, 20, 30));
        System.out.println("Sum of 2 doubles: " + calc.add(5.5, 6.5));
    }
}
