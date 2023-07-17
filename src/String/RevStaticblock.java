package String;

public class RevStaticblock
{
    static String a ="MUMBAI";
    static
    {
        String reverse = "";
        for(int i =0;i<a.length();i++) {
            char ch = a.charAt(i);
            reverse = ch + reverse;
        }
        System.out.println(reverse);
    }

    public static void main(String[] args)
    {

    }
}
