package Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

class fileReader {

    public static void main(String[] args) {
     //  FileReader obj = new FileReader("ssp.txt");

        try {
            FileReader obj = new FileReader("ssp.txt");

            Scanner sc = new Scanner(obj);
            while (sc.hasNext()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }
        System.out.println("Exception handled");


    }

}
