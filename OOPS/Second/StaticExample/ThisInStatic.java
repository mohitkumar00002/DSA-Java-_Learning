package Second.StaticExample;

public class ThisInStatic {
    public class Demo {
    int age;

    static void show() {
        System.out.println(this.age); //  ERROR: Cannot use 'this' in static context
    }

    public static void main(String[] args) {
        Demo.show();
    }
}

}
