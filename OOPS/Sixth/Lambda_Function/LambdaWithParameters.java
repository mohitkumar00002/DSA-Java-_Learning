package Sixth.Lambda_Function;

interface Calculator{
    int add(int n1, int n2);
}
public class LambdaWithParameters {
    public static void main(String[] args) {
        Calculator sum = (int n1, int n2) -> n1+n2;
        System.out.println("Sum : "+ sum.add(10,20));
    }
    

}
