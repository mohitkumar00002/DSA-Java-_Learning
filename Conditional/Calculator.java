// import java.util.Scanner;

// public class Calculator {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.println("Select an operation : ");
//         System.out.println("1. Add");
//         System.out.println("2. Subtract");
//         System.out.println("3. Multiply");
//         System.out.println("4. Divide");

//         System.out.println("Enter choice (1/2/3/4) ");
//         int choice = scanner.nextInt();

//         System.out.print("Enter first number : ");
//         int num1 = scanner.nextInt();
  
//         System.out.print("Enter second number : ");
//         int num2 = scanner.nextInt();

//         int result = 0;

//         switch (choice) {
//             case 1:
//                 result = num1+num2;
//                 System.out.println("Result : "+ result);
//                 break;
//             case 2:
//                 result = num1-num2;
//                 System.out.println("Result : "+ result);
//                 break;
//             case 3:
//                 result = num1*num2;
//                 System.out.println("Result : "+ result);
//                 break;
//             case 4:
//                 result = num1/num2;
//                 System.out.println("Result : "+ result);
//                 break;
//             default:
//                 System.err.println("Please enter valid operation");
//         }
//     }

// }

import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter choice ('+', '-', '*', '/') ");
        char choice = input.next().trim().charAt(0);

        System.out.print("Enter first number : ");
        int num1 = input.nextInt();
        System.out.print("Enter second number : ");
        int num2 = input.nextInt();
        int result = 0;

        switch (choice) {
            case '+':
                result = num1+num2;
                System.out.println("Result : "+ result);
                break;
            case '-':
                result = num1-num2;
                System.out.println("Result : "+ result);
                break;
            case '*':
                result = num1*num2;
                System.out.println("Result : "+ result);
                break;
            case '/':
                result = num1/num2;
                System.out.println("Result : "+ result);
                break;
            default:
                System.err.println("Please enter valid operation");
        }
    }

}
