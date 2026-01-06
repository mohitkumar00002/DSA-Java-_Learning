package AccesModifiers;

class Student{
        String name;     // default variable → package-private  
        private int rollNo;       // private variable → encapsulated

        public void setRollNo(int rollNo){
            this.rollNo = rollNo;
        }
        public int getRollNo(){
            return rollNo;
        }
    }

    class Child extends Student{
        Child(){
            this.name = "Mohit";
            // this.rollNo = 123;  // not accessible bcoz it is private

        }
    }
public class PrivateKeyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        // s1.rollNo = 123; //alse not accessible here

        s1.setRollNo(123);
        System.out.println(s1.getRollNo());

        
    }
}