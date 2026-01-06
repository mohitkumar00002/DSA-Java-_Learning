// Differentiate between instance variables and parameters
// When local variables (parameters) have the same name as instance variables, this is used to avoid confusion
class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;  // Refers to instance variable
        this.age = age;    // Refers to instance variable
    }

    void display() {
        System.out.println("Name: " + this.name + ", Age: " + this.age);
    }
}

public class FirstUse {
    public static void main(String[] args) {
        Student s = new Student("Mohit", 21);
        s.display();
    }
}

