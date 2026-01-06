// public class SingleAppearanceWhenOthersThrice {
//   public static void main(String[] args) {
//      int[] arr = {2,2,2,5,2,7,7,7,8,8,7,8,8};
//      System.out.println(unique(arr));
//   }
//   static int unique(int[] arr){
//     int[] bit_array = new int[32];

//     for(int i=0;i<arr.length;i++){
//       for(int j=0;j<32;j++){
//         if(((arr[i] >>> j) & 1) == 1) bit_array[j]++;
//       }
//     }
//     int result = 0;
//     for(int i=0;i<32;i++){
//       if(bit_array[i] % 4 != 0){
//         result |= (1<<i);
//       }
//     }
//     return result;
//   }
// }

