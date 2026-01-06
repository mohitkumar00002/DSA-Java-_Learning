package Sixth.ExceptionHandling;

public class ThrowKeyword {
    public static void main(String[] args) {
        int age = 18;
        if(age<18){
            throw new ArithmeticException("Not eligible for voting");
        }
        else{
            System.out.println("Eligible for voting");
        }
    }
}
