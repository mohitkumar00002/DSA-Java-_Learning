package AccesModifiers;

class Student {
    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        // 1. check if both are same reference
        if (this == obj) return true;

        // 2. check if obj is null
        if (obj == null) return false;

        // 3. check if both objects belong to same class
        if (this.getClass() != obj.getClass()) return false;

        // 4. type cast to Student
        Student other = (Student) obj;

        // 5. compare fields
        return this.rollNo == other.rollNo && this.name.equals(other.name);
    }

    @Override
    public String toString() {
        return "Roll No: " + rollNo + ", Name: " + name;
    }
}

public class EqualsMethod {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Raman");
        Student s2 = new Student(101, "Raman");
        Student s3 = new Student(102, "Mohit");

        System.out.println("s1.equals(s2): " + s1.equals(s2)); // true
        System.out.println("s1.equals(s3): " + s1.equals(s3)); // false
    }
}
