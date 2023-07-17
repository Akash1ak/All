package String;

import java.util.Scanner;

public class sentencerev
{
    public static void main(String[] args){
        String str = "my name is Akash";
        String rev = "";

        String s[] = str.split(" ");//important because it works to break words from the space
        for(int i=0;i<s.length;i++)
       {
            rev = s[i]+" "+rev;
       }
        System.out.println("Reversed sentence: " + rev);
    }


















//    public static void main(String[] args) {
//        String str = "my name is Akash";
//        String rev = "";
//        String[] s = str.split(" ");
//
//        for (int i = 0, i<str.length();i++)
//        {
//            rev = s[i] + " " + rev;
//        }
//        System.out.println("reverse ="+rev);
//    }
}
