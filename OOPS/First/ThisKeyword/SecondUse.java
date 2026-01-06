// Call another constructor in the same class
// this() can be used to call another constructor from inside a constructor.

public class SecondUse {
    public static void main(String[] args) {
        Car c1 = new Car(); // Default constructor calls parameterized
        c1.display();
        
    }
    static class Car{
        String name;
        int model;
        boolean isInsured;

        Car(){
            this("Swift",2019,true); // calls parameterized constructor
        }

        Car(String car_name, int car_model, boolean insurance) {
            this.name = car_name;
            this.model = car_model;
            this.isInsured = insurance;
        }
        void display(){
            System.out.println("Car Name: "+ this.name);
            System.out.println("Car Model: "+ this.model);
            System.out.println("Have Insurance Policy : "+ isInsured);
        }
    }
    
}