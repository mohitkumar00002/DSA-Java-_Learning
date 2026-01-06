package Third.Inheritance;
class Box{
    double length;
    double width;
    double height;

    Box(){
        length = -1;
        width = -1;
        height = -1;
    }
    Box(double l, double w, double h){
        this.length = l;
        this.width = w;
        this.height = h;
    }
    Box(Box copy){
        this.length = copy.length;
        this.width = copy.width;
        this.height = copy.height;
    }
    void display(){
        System.out.println("Length: "+ length);
        System.out.println("Width: "+ width);
        System.out.println("Height: "+ height);
    }
}
class BoxWeight extends Box{
    double weight;
    BoxWeight(){
        weight = -1;
    }
    BoxWeight(double length, double width, double height, double weight){
        super(length, width, height);
        this.weight = weight;

    }
    BoxWeight(BoxWeight other){
        super(other);
        this.weight = other.weight;
    }
    @Override
    void display(){
        super.display();
        System.out.println("Weight: "+ weight);
    }

}
class BoxCost extends BoxWeight{
    double cost;
    BoxCost(){
        weight = -1;
    }
    BoxCost(double length, double width, double height, double weight, double cost){
        super(length, width, height, weight);
        this.cost = cost;

    }
    BoxCost(BoxCost other2){
        super(other2);
        this.cost = other2.cost;
    }
    @Override
    void display(){
        super.display();
        System.out.println("Cost: "+ cost);
    }

}

public class MultilevelInheritance {
    public static void main(String[] args) {
        BoxWeight b1 = new BoxWeight(6,7,8,9);
        b1.display();

        BoxCost b2 = new BoxCost(7,8,9,200,1000);
        b2.display();
    }
}
