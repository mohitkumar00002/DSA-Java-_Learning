// import java.util.Scanner;

// public class Palindrome{
//   public static void main(String[] args) {
//     Scanner input = new Scanner(System.in);
//     System.out.print("Enter text : ");
//     String str = input.next();
//     boolean isPalindrome = true;
//     int left = 0;
//     int right = str.length()-1;
//     while(left<right){
//       if(str.charAt(left) != str.charAt(right)){
//         isPalindrome = false;
//         break;
//       }
//       left++;
//       right--;
//     }
//     if(isPalindrome){
//       System.out.println("Palindrome");
//     }
//     else{
//       System.out.println("Not Palindrome");
//     }
//   }
// }


// Method - 2

import java.util.Scanner;

public class Palindrome {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter text: ");
    String str = input.next();
    String reversed = "";
    for(int i=str.length()-1;i>=0;i--){
      reversed = reversed + str.charAt(i);
    }
    System.out.print(reversed);

  }
}