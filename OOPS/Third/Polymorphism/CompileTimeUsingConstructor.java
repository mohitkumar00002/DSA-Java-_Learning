package Third.Polymorphism;

class sum{
    int result = 0;

    sum(){
        System.out.println("Sum : "+ result);
    }
    sum(int a, int b, int c){
        this.result = a+b+c;
        System.out.println("Sum: "+result);
    }
    sum(int a, int b, int c, int d){
        this.result = a+b+c+d;
        System.out.println("Sum: "+ result);
    }
    sum(double a){
        double res = a;
        System.out.println("Sum:"+res);

    }
    sum(double a, double b){
        double res = a+b;
        System.out.println("Sum:"+res);

    }

}
public class CompileTimeUsingConstructor{
    public static void main(String[] args) {
         sum s = new sum();
         sum s2 = new sum(4,6,7,8);
    }
}
