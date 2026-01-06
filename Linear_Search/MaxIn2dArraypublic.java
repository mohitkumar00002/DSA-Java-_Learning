
public class MaxIn2dArraypublic {
    public static void main(String[] args) {
        int[][] arr = {{12,34,54},{24,76,95},{76,45,67},{90,77,33}};
        Max(arr);

    }
    static int Max(int[][] arr){
        int max = arr[0][0];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]>max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Maximum number is : "+ max);
        return 0;
    }
}