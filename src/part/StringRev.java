package part;

public class StringRev
{
    public static void main(String[] args) {
         String str ="Akash";
         String rev ="";
         for(int i=0;i<str.length();i++)
         {
             char ch =str.charAt(i);
             rev =ch+rev;
         }
        System.out.println("reverse="+rev);

    }
}
