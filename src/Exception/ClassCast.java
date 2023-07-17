package Exception;

public class ClassCast
{
        public static void main(String[] args)
        {
            Object obj = new Object();
            String str = (String)obj;
            System.out.println(str);
        }
    }

