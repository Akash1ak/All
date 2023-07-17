package exceptionpratic;
public class naun
{
    public static void main(String[] args) {
        int a =5;
        int b =0;

        try
        {
            int c =a/b;
        }
        catch (Exception e)
        {
            //  e.printStackTrace();
            // System.out.println(e.toString());
            System.out.println(e.getMessage());
        }
    }
}

