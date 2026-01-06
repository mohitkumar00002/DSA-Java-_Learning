class Student {
    String name;
    int age;

    // Constructor 1 - No arguments
    Student() {
        name = "Unknown";
        age = 0;
    }

    // Constructor 2 - One argument
    Student(String n) {
        name = n;
        age = 0;
    }

    // Constructor 3 - Two arguments
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Student s1 = new Student();                  // calls Constructor 1
        Student s2 = new Student("Rahul");           // calls Constructor 2
        Student s3 = new Student("Priya", 22);       // calls Constructor 3

        s1.display();
        s2.display();
        s3.display();
    }
}
