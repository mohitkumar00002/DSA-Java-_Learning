public class FlippingAnImage {
  public static void main(String[] args) {
    int[][] arr = {{1,1,0},{0,1,0},{1,1,1}};
    
     
  }
  static int[][] flipImage(int[][] arr){
    int [][] newArray = new int[3][3];
    for(int i=0;i<arr.length;i++){
      for(int j=arr[i].length-1;j>=0;j--){
        newArray[i][j] = arr[i][j];
      }
    }
  }
}
