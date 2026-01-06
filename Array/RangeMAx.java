public class RangeMAx {
    public static void main(String[] args) {
        int[] arr = {11,22,44,22,55,31,67,52,87,93,20,100,90,80};
        RangeMAx(arr, 0, 5);
    }
    static void RangeMAx(int[]arr,int index1,int index2){
        if (index1 < 0 || index2 >= arr.length || index1 > index2) {
            System.out.println("Invalid index range.");
            return;
        }
        int max = arr[index1];
        for(int i=0;i<=index2;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Maximum : "+max);
    }
}
