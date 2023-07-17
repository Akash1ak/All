package Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class intruppetrd
{

//        public static void main(String[] args) throws InterruptedException {  //this is must to right throws exception
//            for(int i = 1; i <= 5; i++)
//                System.out.println("Value of i: " +i);
//            Thread.sleep(1000);
//            System.out.println("Hello Java");
//        }
//public static void main(String[] args) throws FileNotFoundException {
//    File file = new File("not_existing_file.txt");
//    FileInputStream stream = new FileInputStream(file);
//}
public static void main(String[] args)
{
//    try {
//        int value = 5;
//        if (value < 10)
//            throw new RuntimeException("Value is less than 10");
//    }
//    catch (RuntimeException re) {
//        System.out.println(re.getMessage());
//    }
//    System.out.println("Outside try-catch block");
//    for (int i = 1; i <= 5; i++) {
//        System.out.print(i + " ");
//        try {
//            int a = 10;
//            int b = 0;
//            int c = a/b;
//            System.out.println(c);
//        }
//        catch (ArithmeticException ae) {
//           // System.out.println(ae.getMessage());
//        }
//    }
    try {
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
            int a = 20;
            int b = 0;
            int c = a/b;
            System.out.println(""+c);
        }
    }
    catch (ArithmeticException ae) {
    }
}
    }

