package Sixth;

class Student implements Comparable<Student> {
    int roll;
    double marks;

    Student(int roll, double marks) {
        this.roll = roll;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student s) {
        // Compare by m1 (you can also compare by m2 if you want)
        if (this.marks == s.marks)
            return 0;
        else if (this.marks > s.marks)
            return 1;
        else
            return -1;
    }
}

public class ComparableInterface {
    public static void main(String[] args) {
        Student kunal = new Student(45, 70.5);
        Student ram = new Student(50, 83);

        int result = kunal.compareTo(ram);

        if (result < 0) {
            System.out.println("Kunal < Ram : " + result);
        } else if (result > 0) {
            System.out.println("Kunal > Ram : " + result);
        } else {
            System.out.println("Kunal = Ram");
        }
    }
}
