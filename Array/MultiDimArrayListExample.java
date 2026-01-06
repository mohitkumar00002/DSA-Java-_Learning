import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimArrayListExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Creating a 2D ArrayList
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // Adding rows
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }
        
        // Adding elements using loop
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                list.get(i).add(input.nextInt());
            }
        }
        System.out.println(list);

        // Adding elements to each row
        // list.get(0).add(1);
        // list.get(0).add(2);

        // list.get(1).add(3);
        // list.get(1).add(4);

        // list.get(2).add(5);
        // list.get(2).add(6);



        // Printing the 2D ArrayList
        // for (int i = 0; i < list.size(); i++) {
        //     System.out.println("Row " + i + ": " + list.get(i));
        // }
    }
}
