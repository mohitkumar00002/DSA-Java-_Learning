
public class BlockScoping {
    public static void main(String[] args) {
        // Variables declared inside loops, if-else, or any {} block Accessible only inside that block.
        if (true) {
            int blockVar = 20;
            System.out.println(blockVar); // works
        }
        // System.out.println(blockVar); ❌ Not accessible here
        
    }
}
