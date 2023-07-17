package String;

import java.sql.SQLOutput;

public class Length
{
    public static void main(String[] args) {
        String a ="oneAndOnly";
        String b ="my best friend is my ";
        System.out.println("length of String = "+a.length());
        System.out.println("char at the value 3= "+a.charAt(3));
        System.out.println("Substring with only starting = "+a.substring(4));
        System.out.println("substring with starting and ending = "+a.substring(2,10));
        System.out.println("concate String = "+b.concat(a));
        System.out.println("index of = "+b.indexOf("friend"));//8
        System.out.println("index of two char and int ="+b.indexOf("ie",1));
        System.out.println("last index = "+b.lastIndexOf("m"));
        boolean ak = "my".equals("my");
        boolean aka = "my".equalsIgnoreCase("my") ;
        System.out.println("boolean value = "+ak );
        System.out.println("rqualsignore = "+aka);
        String str ="AKASH BIRADAR";
        System.out.println("convert lower case ="+str.toLowerCase());
        String st = "          akash biradar ";
        System.out.println("convert Upper case ="+st.toUpperCase());
        System.out.println("trim method = "+st.trim());
        System.out.println("replace the characters ="+b.replace("m","a"));

    }
}
