package Abstract;

interface Animal{
    void sound();
    void sleep();
}
class Dog implements Animal{
    public void sound(){
        System.out.println("Dog barks");
    }
    public void sleep(){
        System.out.println("Dog sleeps");
    }
}
public class InterfaceExample {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.sleep();

        
    }
}
