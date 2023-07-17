package ExceptionHandling;
import java.io.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class write {
    public static void main(String[] args) throws IOException {
       FileWriter obj = new FileWriter("show.txt");    //java.io.IOException
        try {
          // File obj = new File("show.txt");
            try {
                obj.write("ok done ");
            } finally {
                obj.close();
            }
        } catch (Exception e) {
            System.out.println("file dose not exist");
        }
    }
}
