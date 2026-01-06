package Sixth.ExceptionHandling;

class MyException extends Exception{
    MyException(String msg){
        super(msg);
    }
}
public class CustomException {
    public static void main(String[] args) {
        try{
            throw new MyException("This is my Custom exception");
        }
        catch(MyException e){
            System.out.println("Caught : " +   e.getMessage());
        }
    }
}