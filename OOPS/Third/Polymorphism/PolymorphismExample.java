package Third.Polymorphism;
class shapes{
    void area(){
        System.out.println("I am in shapes");
    }
}
class circle extends shapes{
    void area(){
        System.out.println("Area of Circle");
    }
}
class square extends shapes{
    void area(){
        System.out.println("Area od Square");
    }
}
class rectangle extends shapes{
    void area(){
        System.out.println("Area of rectangle");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        shapes shapes = new shapes();
        circle circle = new circle();
        square sq = new square();
        rectangle rect = new rectangle();

        shapes.area();
        circle.area();
        sq.area();;
        rect.area();

    }
}
