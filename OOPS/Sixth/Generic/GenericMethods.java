package Sixth.Generic;

class Test{
    static <T> void printArray(T[] arr){
        for(T item : arr){
            System.out.print(item + " ");
        }
    }
}

public class GenericMethods {
    public static void main(String[] args) {
        Integer[] intArr = {1, 2, 3, 4};
        Test.printArray(intArr);
        System.out.println();
        // String array
        String[] strArr = {"A", "B", "C"};
        Test.printArray(strArr);
        
    }
}
