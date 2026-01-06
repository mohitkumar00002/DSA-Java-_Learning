package Array;

import java.util.Arrays;

public class PassingInFunction {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        change(nums);
    }
    static void change(int[] x){
        x[1] = 100;
        System.out.println(Arrays.toString(x));
    }
}
