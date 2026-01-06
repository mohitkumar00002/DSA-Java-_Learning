import java.util.Arrays;

public class SwapArrayElement {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        swap(arr, 2, 4);
    }
    static void swap(int[] x, int index1, int index2){
        int temp = x[index1];
        x[index1] = x[index2];
        x[index2] = temp;
        System.out.println(Arrays.toString(x));
    
    }
}
