import java.util.Scanner;

public class AllPrimeNumbersUptoN {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int num = input.nextInt();
    
    for(int j=2;j<=num;j++){
      if(isPrime(j)){
        System.out.print(j + " ");
      }
    }
  }
  static boolean isPrime(int num){
    if(num <= 1) return false;
    if(num == 2) return true;
    if(num % 2 == 0) return false;
    
    for(int i=3;i*i<=num; i+=2){
      if(num % i==0) return false;
    }
    return true;
  }
  
}