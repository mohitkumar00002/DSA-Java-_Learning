package Second.StaticExample;

public class InnerClass {
    static class Test{
        String name;

        public Test(String name){
            this.name = name;
        }
        void display(){
            System.out.println("Name : "+ this.name);
        }
    }
    public static void main(String[] args) {
        Test a = new Test("Java");
        Test b = new Test("Python");
        System.out.println(a.name);
        // a.display();
    }
}
