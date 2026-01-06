package Sixth.Generic;

import java.util.*;

public class UpperBoundedWildcard {
    public static void sum(List<? extends Number> list) {
        double total = 0.0;
        for (Number n : list) {
            total += n.doubleValue();
        }
        System.out.println("Sum = " + total);
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(10, 20, 30);
        List<Double> doubleList = Arrays.asList(2.5, 3.5);

        sum(intList);      // works (Integer extends Number)
        sum(doubleList);   // works (Double extends Number)
    }
}
