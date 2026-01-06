
public class LoopScoping {
    public static void main(String[] args) {
        // Loop Scope (Special case of Block Scope)
        for (int i = 0; i < 5; i++) {
            System.out.println(i); // i is accessible here
        }
        // System.out.println(i); ❌ i is out of scope
        
    }
}
