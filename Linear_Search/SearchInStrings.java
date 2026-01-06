// for the first searched character
// import java.util.Scanner;

// public class SearchInStrings {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         String str = "DSA using Java";
//         System.out.print("Enter the character for presence : ");
//         char target = input.next().charAt(0);
//         SearchInStrings(str, target);

//     }
//     static void SearchInStrings(String str, int target){
//         if(str.length()<=0){
//             System.out.println("String is empty!");
//         }
//         boolean found = false;
//         int index = -1;
//         for(int i=0; i<str.length(); i++){
//             if(target == str.charAt(i)){
//                 found = true;
//                 index = i;
//                 break;
//             }
//         }
//         if(found){
//             System.out.println("Character found at index : "+ index);
//         }
//         else{
//             System.out.println("Character is not present");
//         }
// }
// }

// for all the searched character

import java.util.Scanner;

public class SearchInStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = "DSA using Java";
        System.out.print("Enter the character for presence : ");
        char target = input.next().charAt(0);
        SearchInStrings(str, target);

    }
    static void SearchInStrings(String str, int target){
        if(str.length()<=0){
            System.out.println("String is empty!");
        }
        boolean found = false;
        for(int i=0; i<str.length(); i++){
            if(target == str.charAt(i)){
                found = true;
                System.out.println("Character found at index : "+ i);
            }
        }
        if(!found){
            System.out.println("Character is not present");}

}
}