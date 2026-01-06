public class SingleAppearanceEvenLogic {
  public static void main(String[] args) {
    int[] arr = {2,3,4,1,2,1,3,6,4};
    System.out.println(singleNumber(arr));
  }

  static int singleNumber(int[] arr){
    int result = 0;
    for(int num : arr){
      result ^= num;
    }
    return result;
  }
}


// Start: result = 0

// Step 1: result = 0 ^ 2 = 2
// Step 2: result = 2 ^ 3 = 1
// Step 3: result = 1 ^ 4 = 5
// Step 4: result = 5 ^ 1 = 4
// Step 5: result = 4 ^ 2 = 6
// Step 6: result = 6 ^ 1 = 7
// Step 7: result = 7 ^ 3 = 4
// Step 8: result = 4 ^ 6 = 2
// Step 9: result = 2 ^ 4 = 6


