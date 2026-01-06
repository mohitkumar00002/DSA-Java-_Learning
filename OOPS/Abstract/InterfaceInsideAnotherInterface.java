package Abstract;
interface Parent {
    void display();

    interface Child {
        void show();
    }
}

class Test implements Parent.Child {
    public void show() {
        System.out.println("Nested Interface inside Interface");
    }
}

public class InterfaceInsideAnotherInterface {
    public static void main(String[] args) {
        Parent.Child obj = new Test();
        obj.show();
    }
}
