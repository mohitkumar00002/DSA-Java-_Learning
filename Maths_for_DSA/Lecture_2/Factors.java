import java.util.Scanner;

public class Factors {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int num = input.nextInt();
    
    Factor(num);
    Factor2(num);
  }
  // O(n)
  static void Factor(int n){
    System.out.print("Factors of "+ n + " : ");
    
    for(int i=1;i<=n;i++){
      if(n%i == 0){
        System.out.print(i + " ");
      }
    }
  }

 // O(sqrt(n))
static void Factor2(int n) {
  System.out.print("Factors of " + n + " : ");

  for (int i = 1; i * i <= n; i++) {
    if (n % i == 0) {

      if (i == n / i) {
        // perfect square case
        System.out.print(i + " ");
      } else {
        System.out.print(i + " " + (n / i) + " ");
      }
    }
  }
}

}