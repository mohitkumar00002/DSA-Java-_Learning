// import java.util.Scanner;

// public class PrimeNumbers {
//   public static void main(String[] args) {
//     Scanner input = new Scanner(System.in);
//     System.out.print("Enter the number: ");
//     int num = input.nextInt();
//     int result = primeNum(num);
//     if(result == 0){
//       System.out.println("0 and 1 are neither prime nor composite");
//     }
//     else if(result == 1){
//       System.out.println(num + " is a prime number");
//     }
//     else{
//       System.out.println(num + " is not a prime number");
//     }

//   }
//   static int primeNum(int num){
//     if(num == 0 || num == 1){
//       return 0;
//     }
//     for(int i=2;i<num;i++){
//       if(num % i == 0){
//         return -1;
//       }
//     }
//     return 1;
//   }
// }


// Optimized
import java.util.Scanner;

public class PrimeOptimized {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int num = input.nextInt();

    if (isPrime(num)) {
      System.out.println(num + " is a prime number");
    } else {
      System.out.println(num + " is not a prime number");
    }
  }

  static boolean isPrime(int num) {
    if (num <= 1) return false;
    if (num == 2) return true;
    if (num % 2 == 0) return false;

    //  check only odd numbers till sqrt(num)
    for (int i = 3; i * i <= num; i += 2) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }
}
