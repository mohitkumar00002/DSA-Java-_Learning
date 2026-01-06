package Sixth.Generic;

// class Box<T>{
//     private T value;
//     public void setValue(T value){
//         this.value = value;
//     }

//     public T getValue(){
//         return value;
//     }
// }
// public class GenericClass {
//     public static void main(String[] args) {
//         Box<Integer> b1 = new Box<>();
//         b1.setValue(45);
//         System.out.println(b1.getValue());

//         Box<String> b2 = new Box<>();
//         b2.setValue("ABCD");
//         System.out.println(b2.getValue());
//     }
// }

class Box<T>{
    T value;

    Box(T value){
        this.value = value;
    }

    @Override
    public String toString() {
        return "Box contains: " + value;
    }
}
public class GenericClass {
    public static void main(String[] args) {
        Box<String> b1 = new Box<>("String");
        System.out.println(b1);

        Box<Integer> b2 = new Box<>(23);
        System.out.println(b2);
    }
}
