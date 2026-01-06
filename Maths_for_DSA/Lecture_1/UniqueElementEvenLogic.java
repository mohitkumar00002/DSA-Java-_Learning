public class UniqueElementEvenLogic {
  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,-4,-3-2-1};
    System.out.println(Unique(arr));
  }

  static int Unique(int[] arr){
    int unique = 0;
    for(int num : arr){
       unique = unique + num;
    }
    return unique;
  }
}
