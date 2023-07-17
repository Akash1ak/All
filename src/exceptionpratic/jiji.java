package exceptionpratic;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class jiji
{
    public static void main(String[] args) //throws FileNotFoundException
     {
        try(FileOutputStream f  = new FileOutputStream("akash.txt"))
        {
            String text
                    = "Hello World. This is my java program";
        }
        catch (Exception e) {
            System.out.println(e);
        }
         System.out.println(
                 "Resource are closed and message has been written into the akash.txt");
     }
}

