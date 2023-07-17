package practic;

import java.io.File;
import java.io.IOException;

public class Listoffiles
{
        public static void main(String args[]) throws IOException
        {
            File directoryPath = new File("C:\\feb_code");

            String allfiles[] = directoryPath.list();
            System.out.println("List of files and directories in the specified directory:");
            for(int i=0; i<allfiles.length; i++) {
                System.out.println(allfiles[i]);
            }
        }
    }

