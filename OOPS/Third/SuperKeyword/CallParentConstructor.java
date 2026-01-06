package Third.SuperKeyword;
class Parent {
    Parent() {
        System.out.println("Parent constructor");
    }
}

class Child extends Parent {
    Child() {
        super(); // Calls Parent's constructor
        System.out.println("Child constructor");
    }
}

public class CallParentConstructor {
    public static void main(String[] args) {
        new Child();
    }
}
