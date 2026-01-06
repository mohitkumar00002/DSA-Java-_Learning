package Third.Inheritance;

public class InheritanceExample {
    public static void main(String[] args) {
        // Box b1 = new Box();
        // b1.display();

        // Box b2 = new Box(10.5);
        // b2.display();

        // Box b3 = new Box(7,8,9.8);
        // b3.display();
        
        // BoxWeight w1 = new BoxWeight();

        BoxWeight w2 = new BoxWeight(7,8,9,100);

        // private variable accessing
        BoxWeight newBox = new BoxWeight();
        // System.out.println(newBox.l); // unable to direct acces

        Box a = new BoxWeight(2,3,4,8);
        // Parent reference → Child object
        // This is called upcasting.        
        // You can store a BoxWeight object in a Box reference because BoxWeight IS-A Box (inheritance).
        // Limitation: a can only access methods and variables defined in Box (not BoxWeight-specific members like weight), unless overridden.
        BoxWeight b = new Box(2,3,4,5);
        // Child reference → Parent object
        // This is downcasting without compatibility, which Java doesn't allow directly.
        
        
    }
    static class Box{
        super(); //In Java the Object class is the parent of all classes.Every single class you make — even if you don’t say extends Object — automatically inherits from it.
        private double l;
        double w;
        double h;

        Box(){
            this.l = -1;
            this.w = -1;
            this.h = -1;
        }
        Box(double side){
            this.l = side;
            this.w = side;
            this.h = side;

        }
        Box(double length, double width, double height){
            this.l = length;
            this.w = width;
            this.h = height;
        }
        Box(Box old){
            this.l = old.l;
            this.w = old.w;
            this.h = old.h;
        }
        void display(){
            System.out.println("Length : "+this.l);
            System.out.println("Width : "+this.w);
            System.out.println("Height : "+h);

        }
    }
    static class BoxWeight extends Box {
        double weight;

        BoxWeight(){
            super();
            this.weight = -1;
            // this.l;    unable to access
        }

        BoxWeight(double length, double width, double height, double weight){
            super(length, width, height);
            this.weight = weight;
        }

         @Override
        void display() {
            super.display(); // Call parent display method
            System.out.println("Weight : " + this.weight);
        }
        
    }
}
