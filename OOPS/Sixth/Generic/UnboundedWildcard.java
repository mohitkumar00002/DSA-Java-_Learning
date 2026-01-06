package Sixth.Generic;
import java.util.*;

public class UnboundedWildcard {
    public static void printList(List <?> list){
        for(Object obj : list){
            System.out.println(obj);
        }
    }
    public static void main(String[] args) {
        List<Integer> intArr = Arrays.asList(1,2,34,45);
        List<String> strArr = Arrays.asList("a","b","c");

        System.out.println(intArr);
        System.out.println(strArr);
    }
}
