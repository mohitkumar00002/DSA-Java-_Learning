package Third.SuperKeyword;

class Parent {
    void showParent() {
        System.out.println("Parent method called");
    }
}

class Child extends Parent {
    // Instance Initializer Block
    {
        System.out.println("IIB: Runs before constructor");
        super.showParent(); // Call parent method from IIB
    }

    Child() {
        System.out.println("Child constructor called");
    }
}

public class SuperInIIBExample {
    public static void main(String[] args) {
        new Child();
    }
}
