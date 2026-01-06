import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        arr(1,2,3,4,5,67,8,9);
    }
    static void multiple(int a,int b, String ...v){  // variable-length argumnets always comes at last

    }
    static void arr(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
