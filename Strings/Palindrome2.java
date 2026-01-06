import java.util.Scanner;

public class Palindrome2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter text: ");
    String str = input.next();
    StringBuilder sb = new StringBuilder(str);
    String reversed = sb.reverse().toString();

    if(str.equals(reversed)){
      System.out.println("Palindrome");
    }
    else{
      System.out.println("Not Palindrome");
    }
  

  }
}
