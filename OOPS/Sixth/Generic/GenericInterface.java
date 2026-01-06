package Sixth.Generic;
// interface Container<T> {
//     void add(T item);
//     T get();
// }

// class MyContainer<T> implements Container<T> {
//     private T value;

//     public void add(T item) {
//         this.value = item;
//     }
//     public T get() {
//         return value;
//     }
// }

// public class GenericInterface {
//     public static void main(String[] args) {
//         Container<String> c = new MyContainer<>();
//         c.add("Generics");
//         System.out.println(c.get());
//     }
// }

interface Container<T> {
    void add(T item);
    T get();
}

class MyContainer<T> implements Container<T> {
    private T value;

    MyContainer(T item) {
        this.value = item;
    }

    @Override
    public void add(T item) {
        this.value = item;
    }

    @Override
    public T get() {
        return value;
    }

    @Override
    public String toString() {
        return "Container contains: " + value;
    }
}

public class GenericInterface {
    public static void main(String[] args) {
        MyContainer<String> c = new MyContainer<>("Generics");
        System.out.println(c);

        MyContainer<Integer> c2 = new MyContainer<>(67);
        System.out.println(c2);

        // Demonstrating add and get
        c2.add(100);
        System.out.println("After update -> " + c2.get());
    }
}
