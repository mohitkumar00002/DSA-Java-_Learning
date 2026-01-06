public class Basic{
    public static void main(String[] args){
        System.out.println(args[1]);
    }
}
// static
// Meaning: It belongs to the class, not to an object.

// Function: Allows the JVM to call the main method without creating an object of the class.

// Without it? JVM would need to create an object to run main(), which defeats the purpose of having a standard entry point.