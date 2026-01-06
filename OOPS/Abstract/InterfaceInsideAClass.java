package Abstract;

class Outer{
    interface A{
        void msg();
    }
}
class Test implements Outer.A{
    @Override
    public void msg(){
        System.out.println("This shows nested interface inside a class");
    }
}
public class InterfaceInsideAClass {
    public static void main(String[] args) {
        Test t = new Test();
        t.msg();
    }
}
