package Sixth.Generic;

class Calculator<T extends Number> {
    T num1;
    T num2;

    Calculator(T num1, T num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    void add() {
        double sum = num1.doubleValue() + num2.doubleValue();
        System.out.println("Sum : " + sum);
    }
}
public class BoundedGeneric {
    public static void main(String[] args) {
        Calculator<Integer> a = new Calculator<>(34, 56);
        a.add();

        Calculator<Double> b = new Calculator<>(12.5, 7.5);
        b.add();
    }
}
