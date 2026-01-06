package Abstract;

public class Main {
    public static void main(String[] args) {
        Parent son = new Son();
        son.carrer();
        son.partner();

        Parent daughter = new Daughter();
        daughter.carrer();
        daughter.partner();
    }
}
