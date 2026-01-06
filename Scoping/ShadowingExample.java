// Shadowing happens when a local variable (inside a method or block) has the same name as a class-level variable.
// In that case, the local variable hides or "shadows" the class variable inside that scope.
public class ShadowingExample {

    int x = 50; // Class-level (instance) variable

    public static void main(String[] args) {
        ShadowingExample obj = new ShadowingExample();
        obj.showShadowing();
    }

    void showShadowing() {
        System.out.println("Before shadowing, class-level x = " + x);

        int x = 100; // Local variable shadows the class-level 'x'
        System.out.println("After shadowing, local x = " + x);

        System.out.println("To access class-level x, use 'this.x' = " + this.x);
    }
}
