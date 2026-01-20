import java.util.Scanner;

public class LCM {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the first number : ");
    int num1 = input.nextInt();
    System.out.print("Enter the second number : ");
    int num2 = input.nextInt();

    int lcm = (num1 * num2) / HCM(num1, num2);
    System.out.println("LCM of "+ num1 + " and "+ num2 + " is : "+ lcm);

    System.out.println("LCM of "+ num1 + " and "+ num2 + " is : "+ findLCM(num2, lcm));


  }
  // Relation between LCM and HCF
  // LCM(a, b) × HCF(a, b) = a × b
  // So,
  // LCM(a, b) = (a × b) / HCF(a, b)

  static int HCM(int a, int b){
    while(b!=0){
      int rem = a % b;
      a = b;
      b = rem;
    }
    return a;
  }

static int findLCM(int a, int b) {
  int max = Math.max(a, b);

  for (int i = max; ; i++) {
    if (i % a == 0 && i % b == 0) {
      return i;   // first common multiple = LCM
    }
  }
}


}
