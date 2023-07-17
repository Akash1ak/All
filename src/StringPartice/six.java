package StringPartice;

public class six
{
    public static void main(String[] args) {
        String rr =new String("plz");
        String yy ="plz";
        String ii = new String("plz");
        String ok ="plz";
        System.out.println(rr == yy);//false
        System.out.println(rr.equals(ok));//true
        System.out.println(ok == yy);//true
        System.out.println(ii == yy);//false
    }
}
