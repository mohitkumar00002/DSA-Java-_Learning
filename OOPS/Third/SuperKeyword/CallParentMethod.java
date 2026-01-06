package Third.SuperKeyword;
class Parent {
    void show() {
        System.out.println("Parent show method");
    }
}

class Child extends Parent {
    
    void display() {
        super.show(); // Call Parent's method
        System.out.println("Child show method");
    }
}


public class CallParentMethod {
    public static void main(String[] args) {
        Child C1 = new Child();
        C1.display();
    }
    
}