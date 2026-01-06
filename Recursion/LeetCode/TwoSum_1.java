import java.util.Arrays;
import java.util.Scanner;

public class TwoSum_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {1, 2, 4, 6, 7, 8, 10, 12, 14, 16, 18, 20};
        System.out.print("Enter target: ");
        int target = input.nextInt();

        int[] result = twoSum(arr, target);

        if (result.length == 0) {
            System.out.println("No such pair found");
        } else {
            System.out.println("Indices: " + Arrays.toString(result));
            System.out.println("Values: " + arr[result[0]] + " + " + arr[result[1]] + " = " + target);
        }
    }

    static int[] twoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};  // return the indices
                }
            }
        }
        return new int[]{};  // if no pair found
    }
}
