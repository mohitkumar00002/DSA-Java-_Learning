package Third.Inheritance;

// Parent Class
class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }
}

// Child Class 1
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking...");
    }
}

// Child Class 2
class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing...");
    }
}

// Child Class 3
class Cow extends Animal {
    void moo() {
        System.out.println("Cow is mooing...");
    }
}

public class HierarchicalExample {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();  // from Animal
        d.bark(); // from Dog
        
        System.out.println();

        Cat c = new Cat();
        c.eat();  // from Animal
        c.meow(); // from Cat

        System.out.println();

        Cow cw = new Cow();
        cw.eat(); // from Animal
        cw.moo(); // from Cow
    }
}
