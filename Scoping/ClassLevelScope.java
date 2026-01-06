
public class ClassLevelScope {
    int a = 10;
    static int b = 15;
    public static void main(String[] args) {
        // System.out.println(a); error
        // In Java, you cannot access non-static members directly from a static context. 
        // There a two methods of accesing class variable
        // 1: Make a static
        System.out.println(b);
        
        // 2:  Create an object to access non-static variable
        ClassLevelScope obj = new ClassLevelScope(); // create object
        System.out.println(obj.a); // access non-static variable via object
    }
}
