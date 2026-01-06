package AccesModifiers;

class Student {
    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Roll No: %d, Name: %s", rollNo, name);
    }
}

public class ToStringMethod {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Mohit");
        Student s2 = new Student(102, "Aman");

        System.out.println(s1);  
        System.out.println(s2);
    }
}
