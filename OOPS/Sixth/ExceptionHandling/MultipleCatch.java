package Sixth.ExceptionHandling;

public class MultipleCatch {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        try{
            System.out.println(arr[3]);
        }
        catch(ArithmeticException e){
            System.out.println("Math error");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bounds");
        }
    }
}
