
public class Class_Object {
    public static void main(String[] args) {
        // Object
        Student s1 = new Student();
        s1.name = "Harry";
        s1.age = 29;
        s1.roll_no = 112201;
        
        
        System.out.println(s1);
        
    }
    //Class
    static class Student {
        String name;
        int age;
        int roll_no;

        // void display(){
        //     System.out.println("Student Details:- ");
        //     System.out.println("Name : "+ this.name);
        //     System.out.println("Age : "+this.age);
        //     System.out.println("Roll No. : "+ this.roll_no);

        // }  
        @Override
        public String toString() {
        return "Student{name='" + name + "', age=" + age + ", roll_no=" + roll_no + "}";
    }
    }
    
}

