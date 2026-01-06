package Abstract;
interface Engine{
    static final int price = 87900; // by default static and final
    void start();
    void stop();
    void acc();
}
interface Brake{
    void brake();
    void start();
}
interface Media{
    void start();
    void stop();
}
class Car implements Engine, Brake, Media{
    @Override
    public void brake(){
        System.out.println("I brake like a normal car");
    }

    @Override
    public void start(){
        System.out.println("I start like a normal car");
    }

    @Override
    public void stop(){
        System.out.println("I stop like a normal car");
    }

    @Override
    public void acc(){
        System.out.println("I accelerate like a normal car");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        
        Engine c1 = new Car();
        // c1.brake(); not present in engine
        c1.start();
        c1.stop();
        c1.acc();

        Media carMedia = new Car();
        carMedia.stop();

        
    }
}
