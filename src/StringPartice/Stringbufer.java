package StringPartice;

public class Stringbufer
{
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Akash ");
         str.append("Biradar");
        System.out.println("String buffer :"+str);



        StringBuilder str1 = new StringBuilder("Ashish ");
        str1.append("Biradar");
        System.out.println("String builder :"+str1);
    }
}
