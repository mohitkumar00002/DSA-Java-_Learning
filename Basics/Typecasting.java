import java.util.Scanner;

public class Typecasting{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
         
         float n = 56;
         System.out.println(n);

        // explicit conversion
        float num = (int)(56.45f);
        System.out.println(num);

        // Type promotion
        int b = 387;
        byte a = (byte)(b);
        System.out.println(a);
    }
}