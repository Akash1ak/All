package String;

public class Stringreva
{
    public static void main(String[] args) {
        String str = "akash Biradar";
        String rev ="";

        for(int i =0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            rev = ch+rev;
        }
        System.out.println("reverse : "+rev);
    }
}
