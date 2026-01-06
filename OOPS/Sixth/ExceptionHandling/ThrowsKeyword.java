package Sixth.ExceptionHandling;

import java.io.*;
class Example{
    void readFile() throws IOException{
        FileReader fr = new FileReader("data.txt");
        fr.read();
        fr.close();
    }
}

public class ThrowsKeyword {
    public static void main(String[] args) {
        Example ex = new Example();
        try{
            ex.readFile();
        }
        catch(IOException e){
            System.out.println("File not found");
        }
    }
}