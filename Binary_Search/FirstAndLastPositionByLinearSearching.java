import java.util.Scanner;

public class FirstAndLastPositionByLinearSearching {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {1, 2, 2, 2, 3, 4, 5,6,6,6,6,7,7,8,8,8,8,8};
        System.out.print("Enter the target number: ");
        int target = input.nextInt();
        int first = FirstPosition(nums, target);
        int last = LastPosition(nums, target);
        System.out.println("First and Last position of the targeted element is : ["+ first + ", " + last + "]");
    }
    static int FirstPosition(int[] nums, int target){
        for(int i=0;i<nums.length; i++){
            if(target == nums[i]){
                return i;
            }
        }
        return -1;
    }
     static int LastPosition(int[] nums, int target){
        for(int i=nums.length-1;i>=0; i--){
            if(target == nums[i]){
                return i;
            }
        }
        return -1;
    }
}
