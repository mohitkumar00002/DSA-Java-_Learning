package AccesModifiers;

class Student {
    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
}

public class GetClassExample {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Mohit");

        // Using getClass()
        System.out.println("Class Name: " + s1.getClass());
        System.out.println("Only Name: " + s1.getClass().getSimpleName());
        System.out.println("Package: " + s1.getClass().getPackage());
    }
}
