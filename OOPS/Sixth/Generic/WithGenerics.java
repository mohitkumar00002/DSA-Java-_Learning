package Sixth.Generic;

import java.util.ArrayList;

public class WithGenerics {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(45);
        // list.add("ABC"); not allowed
        System.out.println(list.get(0));
     }
}
