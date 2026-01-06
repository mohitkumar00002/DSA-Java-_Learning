public class Max {
    public static void main(String[] args) {
        int[] arr = {12,100,7,77,90,34,81};
        max(arr);

    }
    static void max (int[] x){
        int max = x[0];
        for(int i=0;i<x.length;i++){
            if(x[i]>max){
                max = x[i];
            }
        }
        System.out.println("Maximum  = "+ max);
    }
}
    