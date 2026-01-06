package Abstract;

interface A{
    void fun();
}
interface B extends A{
    void greet();
}
class Main implements B{
    @Override
    public void greet(){
        System.out.println("Hello, Good Morning");
    }
    @Override
    public void fun(){
        System.out.println("Heehhehhhehhehhh");
    }
}
public class ExtendingInterface {
    public static void main(String[] args) {
        B a = new Main();
        a.fun();
        a.greet();
        
    }
}
