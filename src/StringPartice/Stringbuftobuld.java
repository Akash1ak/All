package StringPartice;

public class Stringbuftobuld
{
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("omkar");

        String sbl = str.toString();

        StringBuffer sbr = new StringBuffer(sbl);
        System.out.println(sbl);
    }
}
