package practic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Readlinebyline
{
//    public static void main(String[] args) {
//        try {
//            Scanner sc = new Scanner(new File("show.txt"));
//
//            while (sc.hasNextLine()) {
//                System.out.println(sc.nextLine());
//            }
//
//            sc.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
public static void main(String[] args) {

    try{
        File file = new File("show.txt");
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
        sc.close();
    }catch (FileNotFoundException e){
        e.printStackTrace();
    }
}

}
