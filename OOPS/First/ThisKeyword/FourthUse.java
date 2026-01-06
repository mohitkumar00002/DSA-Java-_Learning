// Pass the current object as a parameter
// this can be passed to another method or constructor that requires an object of the same class.
class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method that takes Student object as a parameter
    void printDetails(Student obj) {
        System.out.println("Name: " + obj.name);
        System.out.println("Age: " + obj.age);
    }

    // Method that passes the current object
    void sendDetails() {
        printDetails(this); // 'this' means "current object"
    }
}

public class FourthUse {
    public static void main(String[] args) {
        Student s1 = new Student("Mohit", 21);
        s1.sendDetails(); // Here 'this' passes s1 itself
    }
}


