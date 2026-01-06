// // -------------Triangle---------------
// import java.util.Scanner;

// public class PascalTriangle {
//   public static void main(String[] args) {
//     Scanner input = new Scanner(System.in);
//     System.out.print("Enter the number of rows: "); 
//     int rows = input.nextInt(); 
//     pascalTriangle(rows);
    
//   }
//   static void pascalTriangle(int rows){
//     for(int i=1;i<=rows;i++){
//       for(int space = rows-1; space>=i; space--){
//         System.out.print(" ");
//       }
//       for(int star = 1; star<=2*i -1; star++){
//         System.out.print("*");
//       }
//       System.out.println();
//     }
//   }
// }

// -------------Pascal Triangle---------------
import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        pascalTriangle(rows);
    }

    static void pascalTriangle(int rows) {
        for (int i = 0; i < rows; i++) {

            // spaces for centering
            for (int space = rows - 1; space > i; space--) {
                System.out.print(" ");
            }

            int value = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(value + " ");
                value = value * (i - j) / (j + 1);
            }

            System.out.println();
        }
    }
}


