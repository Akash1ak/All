package String;

public class Sout
{
    public static void main(String[] args) {
        String str ="akashBiradar";
        String reverse ="";

        for(int i=0;i<str.length();i++)
        {
            char ch =str.charAt(i);
            reverse =ch+reverse;
        }
        System.out.println(reverse);
    }
}
