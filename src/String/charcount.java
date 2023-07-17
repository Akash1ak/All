package String;

public class charcount
{
    public static void main(String[] ars) {
        String str ="maheshbahu";

        char[]ch = str.toCharArray();
        for(int i=0;i<str.length();i++)
        {
            for (int j =i+1;j<str.length();j++)
            {
                if(ch[i]==ch[j])
                {
                    System.out.println(ch[j]);
                    break;
                }
            }
        }
        
    }
}
