import java.util.Scanner;

public class HCF {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the first number : ");
    int num1 = input.nextInt();
    System.out.print("Enter the second number : ");
    int num2 = input.nextInt();
    System.out.println("HCF of "+ num1 + " and "+ num2 + " is : "+ GCD(num1, num2));
  }
  // Euclidean Algorithm for HCF
  // Time Complexity - O(log(min(a, b)))

  static int GCD(int a, int b){
    while(b != 0){
      int rem = a % b;
      a = b;
      b = rem;
    }
    return a;
  }
  // Simple approach - O(min(a, b))
  static int findHCF(int a, int b) {
    int hcf = 1;

     for (int i = 1; i <= Math.min(a, b); i++) {  // i 1 se leke dono numbers me se jo chhota hai us tak chalega
      if (a % i == 0 && b % i == 0) {
        hcf = i;   // update largest common factor
      }
    }
    return hcf;
  }
}
