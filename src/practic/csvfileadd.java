package practic;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class csvfileadd {
    public static void main(String[] args) throws IOException {
        String File = "students.csv";
        try {
            FileWriter file = new FileWriter(File);
            Scanner sc = new Scanner(File);
            file.write("name,mobile,87" );
            file.close();
            //   }
//        finally {
//            System.out.println("88");
//
//        }
//        }

        } catch (IOException e) {
            e.getStackTrace();

        }
    }
}


