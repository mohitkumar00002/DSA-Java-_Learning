package Second.StaticExample;

class NonStaticInsideStatic {
    public static void main(String[] args) {
        NonStaticInsideStatic a = new NonStaticInsideStatic();
        a.greeting();
        // greeting();  
        greeting2();   // runs
        
    }
    // Error because As we know something which is non-static, belongs to an object
     void greeting(){
        System.out.println("Hello, Good Morning!");
    }
    //  this is not dependent on objects
    static void greeting2(){
        System.out.println("Bye, Good Night");
    }

}
