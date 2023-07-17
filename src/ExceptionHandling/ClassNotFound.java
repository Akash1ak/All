package ExceptionHandling;

import java.io.*;
//import java.io.IOException;

public class ClassNotFound {
    public static void main(String[] args) {
        try {
            // Creating an instance of FileReader class
            FileReader fileReader = new FileReader("ook.txt");

            System.out.println(fileReader.read());

            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}