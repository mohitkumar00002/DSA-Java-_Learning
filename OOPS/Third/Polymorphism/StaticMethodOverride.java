package Third.Polymorphism;

class Parent {
    static void show() {
        System.out.println("Parent static method");
    }
}

class Child extends Parent {
    static void show() {  // method hiding, not overriding
        System.out.println("Child static method");
    }
}

public class StaticMethodOverride {
    public static void main(String[] args) {
        Parent p = new Child();
        p.show();  // calls Parent's show()

        Child c = new Child();
        c.show();  // calls Child's show()
    }
}

