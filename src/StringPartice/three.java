package StringPartice;

public class three
{
    public static void main(String[] args) {
        String ok =new String("mobile");
        String os ="mobile";
        String su = "saurabh";
        String li =new String("saurabh");
        System.out.println(ok == os);//false
        System.out.println(os.equals(ok)); // true
        System.out.println(su.equals(li));//true
        System.out.println(li.equals(os));//false
    }
}
