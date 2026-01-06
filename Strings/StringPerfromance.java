// public class StringPerfromance {
//   public static void main(String[] args) {
//     for(int i=0;i<26;i++){
//       char ch = (char)('a'+ i);
//       System.out.print(ch + " ");
//     }
//   }



public class StringPerfromance {
  public static void main(String[] args) {
    String series = "";
    for(int i=0;i<26;i++){
      char ch = (char)('a'+ i);
      System.out.print(ch + " ");
      series = series + ch + " ";
    }
    System.out.println(series);
   
  }
}


      
      
      