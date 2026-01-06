package Sixth.Generic;

import java.util.ArrayList;

public class WithoutGenerics {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(34);
        list.add("Abc"); // allowed

        // casting
        int n = (int) list.get(0);
        String s = (String) list.get(1);

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        

    }
}
