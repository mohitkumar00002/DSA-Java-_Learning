package Sixth.ExceptionHandling;

public class TryCatchExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try{
            int c = a / b;
            System.out.println("Result : " + c);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}