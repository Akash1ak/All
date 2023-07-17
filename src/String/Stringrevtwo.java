package String;

public class Stringrevtwo
{
    public static void main(String[] args) {
        String s ="my name is Akash";
        String rev ="";
        for(int i = 0; i<s.length() ; i++)
        {
            char ch =s.charAt(i);
            rev =ch+rev;
        }
        System.out.println("rev:"+rev);
    }
}
