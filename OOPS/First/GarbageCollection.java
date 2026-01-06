-0class Student {
    String name;
    Student(String name) {
        this.name = name;
    }
    protected void finalize() {
        System.out.println(name + " is destroyed");
    }
}

public class GarbageCollection {
    public static void main(String[] args) {
        Student s1 = new Student("Mohit");
        Student s2 = new Student("Raj");

        s1 = null; // Now "Mohit" object is eligible for GC
        s2 = null; // Now "Raj" object is eligible for GC

        System.gc(); // Request JVM to run Garbage Collector
    }
}
