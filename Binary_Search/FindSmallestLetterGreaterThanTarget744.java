package Binary_Search;
import java.util.Scanner;

class CeilingLetter744 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] arr = {'a', 'd', 'g', 'j' ,'m', 'p', 's', 'v', 'y'};
        System.out.print("Enter the character for search : ");
        char target = input.next().charAt(0);
        int result = CeilingLetter(arr, target);
        if (result == -1) {
            System.out.println("Ceiling of the targeted element does not exist in the array");
        } else {
            System.out.println("Ceiling letter of the targeted letter is " + arr[result]);
        }
    }

    static int CeilingLetter(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;

        if (target >= arr[end]) {
            return -1; // Next greatest letter not available
        }

        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (target < arr[middle]) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return start; // 'start' points to the ceiling index
    }
}
