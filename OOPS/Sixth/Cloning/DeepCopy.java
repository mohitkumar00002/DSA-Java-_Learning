package Sixth.Cloning;

class Address {
    String city;
    Address(String city) {
        this.city = city;
    }
}

class Student implements Cloneable {
    int id;
    Address addr;

    Student(int id, String city) {
        this.id = id;
        this.addr = new Address(city);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student s = (Student) super.clone();
        s.addr = new Address(this.addr.city); // deep copy of Address
        return s;
    }
}

public class DeepCopy {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student(101, "Hapur");
        Student s2 = (Student) s1.clone();

        s2.addr.city = "Ghaziabad"; // change in cloned object

        System.out.println(s1.addr.city); // Hapur
        System.out.println(s2.addr.city); // Ghaziabad
    }
}

