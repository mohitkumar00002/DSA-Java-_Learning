// import java.util.Scanner;
// public class Power {
//   public static void main(String[] args) {
//     Scanner input = new Scanner(System.in);
//     System.out.print("Enter the base number: ");
//     int base = input.nextInt();
//     System.out.print("Enter the power number: ");
//     int power = input.nextInt();
//     System.out.println(power(base,power));

//   }
//   static int power(int b, int p){
//     int ans = 1;
//     for(int i=1;i<=p;i++){
//       ans = ans * b;
//     }
//     return ans;
//   }
// }

// Binary
import java.util.Scanner;
public class Power {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the base number: ");
    int base = input.nextInt();
    System.out.print("Enter the power number: ");
    int power = input.nextInt();
    System.out.println(power(base,power));
  }
  static int power(int b, int p){
    int ans = 1;

    while(p > 0){
        if((p & 1) == 1){     // if power is odd
            ans = ans * b;
        }
        b = b * b;           // square the base
        p = p >> 1;          // divide power by 2
    }

    return ans;
}

}