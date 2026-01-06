import java.util.Scanner;

public class Range {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Select the data type to see its range:");
        System.out.println("1. byte");
        System.out.println("2. short");
        System.out.println("3. int");
        System.out.println("4. long");
        System.out.println("5. float");
        System.out.println("6. double");
        System.out.println("7. char");
        System.out.println("8. boolean");
        
        int choice = input.nextInt();
        
        switch (choice) {
            case 1:
                System.out.println("byte (signed): Min = " + Byte.MIN_VALUE + ", Max = " + Byte.MAX_VALUE);
                System.out.println("byte (unsigned): Min = 0, Max = " + (Byte.MAX_VALUE - Byte.MIN_VALUE));
                break;
            case 2:
                System.out.println("short (signed): Min = " + Short.MIN_VALUE + ", Max = " + Short.MAX_VALUE);
                System.out.println("short (unsigned): Min = 0, Max = " + (Short.MAX_VALUE - Short.MIN_VALUE));
                break;
            case 3:
                System.out.println("int (signed): Min = " + Integer.MIN_VALUE + ", Max = " + Integer.MAX_VALUE);
                System.out.println("int (unsigned): Min = 0, Max = " + ((long) Integer.MAX_VALUE - Integer.MIN_VALUE));
                break;
            case 4:
                System.out.println("long (signed): Min = " + Long.MIN_VALUE + ", Max = " + Long.MAX_VALUE);
                System.out.println("long (unsigned): Min = 0, Max = " + (Long.MAX_VALUE - Long.MIN_VALUE));
                break;
            case 5:
                System.out.println("float: Min = " + Float.MIN_VALUE + ", Max = " + Float.MAX_VALUE);
                break;
            case 6:
                System.out.println("double: Min = " + Double.MIN_VALUE + ", Max = " + Double.MAX_VALUE);
                break;
            case 7:
                System.out.println("char (unsigned): Min = " + (int) Character.MIN_VALUE + ", Max = " + (int) Character.MAX_VALUE);
                break;
            case 8:
                System.out.println("boolean: Values = " + Boolean.FALSE + " or " + Boolean.TRUE);
                break;
            default:
                System.out.println("Invalid choice. Please select a valid data type.");
        }

        input.close();
    }
}
