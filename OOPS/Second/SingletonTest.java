package Second;
class Singleton {
    private static Singleton obj = new Singleton(); // single object created here

    private Singleton() { } // private constructor

    public static Singleton getInstance() {
        return obj; // return the same object every time
    }

    public void show() {
        System.out.println("Hello from Singleton");
    }
}

public class SingletonTest {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        s1.show();
        s2.show();
        System.out.println(s1 == s2); // true (both are same object)
    }
}
