package Sixth.Generic;

import java.util.*;

public class LowerBounded {
    public static void addNumbers(List<? super Integer> list) {
        list.add(10);
        list.add(20);
        // We cannot assume what type to get, so only adding is safe
        System.out.println(list);
    }

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        List<Number> numList = new ArrayList<>();
        List<Object> objList = new ArrayList<>();

        addNumbers(intList);   // works
        addNumbers(numList);   // works
        addNumbers(objList);   // works
    }
}
}
