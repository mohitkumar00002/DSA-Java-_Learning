// Return the current object
// Useful in method chaining.

class Student {
    String name;

    Student setName(String name) {
        this.name = name;
        return this; // returning current object
    }

    void display() {
        System.out.println("Name: " + name);
    }
}

public class FifthUSe {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Mohit").display(); // method chaining
    }
}

