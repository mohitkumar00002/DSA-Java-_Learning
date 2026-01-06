public class Constructor {
    public static void main(String[] args) {
        Course C1 = new Course(); //calls default constructor
        C1.display(); 
        Course C2 = new Course(101, "Java Programming", 6); // calls parameterized constructor
        C2.display();
        Course C3 = new Course(C1);  // calls copy constructor
        C3.display();
        
    }
    static class Course {
        int course_id;
        String course_name;
        int duration;
        
        // default constructor
        Course(){
            course_id = -1;
            course_name = "Unknown";
            duration = 0;
        }
        // parameterized constructor
        Course(int id, String name, int duration){
            this.course_id = id; 
            this.course_name = name;
            this.duration = duration;
        }

        // Copy constructor
        Course(Course copy){
            course_id = copy.course_id;
            course_name = copy.course_name;
            duration = copy.duration;


        }

            void display(){
                System.out.println("Course Details :-");
                System.out.println("Course ID : "+ this.course_id);
                System.out.println("Course Name : "+ this.course_name);
                System.out.println("Duration : "+ this.duration);
            }
    }
}
