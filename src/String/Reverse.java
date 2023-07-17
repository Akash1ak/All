package String;

public class Reverse
{
    void m1()
        {
        String d ="java";
        for(int i = d.length()-1; i>=0;i--)
        {
            System.out.print("reverse = "+d.charAt(i));
        }
    }
    void m2()
    {
        String str ="java is a oops";
        String reverse = "";
        for(int i = 0;i<str.length();i++) {
            char ch = str.charAt(i);
            reverse = ch + reverse;
        }
        System.out.println(reverse);
    }


    public static void main(String[] args) {
        Reverse reverse = new Reverse();
        reverse.m1();
        reverse.m2();
    }

}
