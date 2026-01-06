package Third.SuperKeyword;

class Parent {
    int num = 10;
}

class Child extends Parent {
    int num = 20;

    void display() {
        System.out.println("Child num: "+ this.num);       // Child variable → 20
        System.out.println("Parent num: "+super.num); // Parent variable → 10
    }
}

public class AccessParentVariable {
    public static void main(String[] args) {
        Child n = new Child();
        n.display();
        System.out.println(n.num); // child num
    }
}
