package Binary_Search;

public class PeakIndexInMountainArray852 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 15, 12, 10, 8, 6, 4, 2, 1};
        int peak = PeakIndexInMountainArray(arr);
        System.out.println("Peak index: " + peak + " and value: "+ arr[peak]);
    }

    static int PeakIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;

            if(arr[mid] < arr[mid + 1]){
                start = mid + 1;
            } 
            else {

                end = mid;
            }
        }
        return start;
    }
}
