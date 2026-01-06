//  Call another method of the same class (this.methodName())
// Although you can call a method directly, this makes it explicit that the method belongs to the current object.

public class ThirdUse {
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.mathod1();
        
    }
    static class Test{
        void mathod1(){
            System.out.println("Method 1 is called");
            this.mathod2();
        }
        void mathod2(){
            System.out.println("Method 2 is called");
        }
    }

}
