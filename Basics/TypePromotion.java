import java.util.Scanner;

public class TypePromotion{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Autmonatic Type promotion
        int b = 257;
        byte a = (byte)(b);
        System.out.println(a);

        int d = 1000;
        char e = 'a';
        int f = d / e;
        System.out.print(e); 
    }

    
}