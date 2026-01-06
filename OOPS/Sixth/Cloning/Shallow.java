package Sixth.Cloning;

class Student implements Cloneable {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();  // default cloning
    }
}

public class Shallow {
    public static void main(String[] args) {
        try {
            Student s1 = new Student(101, "Mohit");
            Student s2 = (Student) s1.clone(); // clone object

            System.out.println(s1.id + " " + s1.name);
            System.out.println(s2.id + " " + s2.name);

            System.out.println(s1 == s2); // false (different objects)
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

