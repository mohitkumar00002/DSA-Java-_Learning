package Binary_Search;
import java.util.Scanner;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {1, 2, 2, 2, 3, 4, 5,6,6,6,6,7,7,8,8,8,8,8};
        System.out.print("Enter the target number: ");
        int target = input.nextInt();

        int first = findPosition(nums, target, true);
        int last = findPosition(nums, target, false);  

        System.out.println("First and Last position of the targeted element is : ["+ first + ", " + last + "]");
    }

    static int findPosition(int[] arr, int target, boolean findFirst) {
        int start = 0, end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                ans = mid;
                if (findFirst == true) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}


