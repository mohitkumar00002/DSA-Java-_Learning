import java.util.Scanner;

public class FindNthBit {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int num = input.nextInt();
    System.out.print("Enter the bit number: ");
    int bit_no = input.nextInt();
    System.out.println(FindBitValue(num, bit_no));
    System.out.println(FindBit(num,bit_no));


  }
  static int FindBitValue(int num, int bit_no){
    return num & (1<< (bit_no - 1));
    
    
  }
  static int FindBit(int num, int bit_no){
    return (num >> (bit_no - 1)) & 1;
    
    
  }
}
 

