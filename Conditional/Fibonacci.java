import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first=0, second=1, next;
        System.out.print("Enter the length of the series : ");
        int len = input.nextInt();
        if(len <= 0){
            System.out.println("Length should be greater than 0.");
        }
        if(len == 1){
            System.out.println(first);
        }
        else{
            System.out.print(first + " " + second);
            for(int i=3;i<=len;i++){
                next = first+second;
                first = second;
                second = next;
                System.out.print(" "+ next);
            }
        }


    }
}