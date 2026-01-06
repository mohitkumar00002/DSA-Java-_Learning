public class EvenDigitNumber {
    public static void main(String[] args) {
        int[] arr = {10, 123, 345, 1, -5748, 39, 57, 109, 4567, 21, 120, 46, 784920};
        int result = EvenDigitNumber(arr);
        System.out.println("Total count of even digits number : "+ result);

    }
    static int EvenDigitNumber(int[] arr){
        int count = 0;
        for(int i=0; i<arr.length;i++){
            int x = arr[i];
            if(x<0){
                x = -x;
            }
            int digit = 0;
            while(x>0){
                digit++;
                x /= 10;
            }
             if(digit%2 == 0){
            count++;
        }
        }
       
        return count;
    }
}