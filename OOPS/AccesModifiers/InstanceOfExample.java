package AccesModifiers;

class Student {
    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
}

class Child extends Student {
    Child(int rollNo, String name) {
        super(rollNo, name);
    }
}

public class InstanceOfExample {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Mohit");
        Child c1 = new Child(102, "Aman");

        // instanceof checks
        System.out.println(s1 instanceof Student); // true
        System.out.println(c1 instanceof Child);   // true
        System.out.println(c1 instanceof Student); // true (Child is a subclass of Student)
        System.out.println(s1 instanceof Child);   // false (Parent is not Child)
        System.out.println(s1 instanceof Object);  // true (All classes inherit Object)
    }
}
}
