import java.util.ArrayList;
import java.util.Scanner;

class ArrList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList <Integer> num = new ArrayList<>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(50);
        num.add(60);
        num.add(70);
        num.add(80);
        num.add(90);
        num.add(100);

        System.out.println(num.contains(45));
        num.set(4, 65);
        System.out.println(num);

        ArrayList <Integer> list = new ArrayList<>();
        for(int i=0;i<5;i++){
            System.out.print("Enter element " +(i+1) + ": ");
            list.add(input.nextInt());
        }
        System.out.println(list);
    }
}