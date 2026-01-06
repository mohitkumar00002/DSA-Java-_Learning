package Abstract;

interface MyInterface {
    void display();  // abstract method

    // static method
    static void show() {
        System.out.println("Static method in interface");
    }
}

class Test implements MyInterface {
    public void display() {
        System.out.println("Display method from class");
    }

    // static methods cannot be override by implementing class
    // @Override
    // public void show(){
    //     System.out.println("Static method overriding");
    // }
}

public class StaticMethodsInsideInterface {
    public static void main(String[] args) {
        Test obj = new Test();
        obj.display();
        // obj.show();

        // Calling static method from interface
        MyInterface.show();  
    }
}

