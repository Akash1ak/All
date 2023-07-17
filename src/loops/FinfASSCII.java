package loops;

import java.util.Scanner;

public class FinfASSCII
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = sc.next().charAt(0);
        int assci = (int) ch;
        System.out.printf("ASCII value of %c is %d\n", ch, assci);
    }
}
