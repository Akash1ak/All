package StringPartice;

public class Seven
{
    public static void main(String[] args) {

        String mo = new String("ok");
        String kk ="ok";
        String ll ="ok";
        String rr = new String("ok");
        String jj =new String("ok done");
        System.out.println(rr == kk);//false
        System.out.println(rr.equals(mo));//true
        System.out.println(jj.equals(rr));//false
        System.out.println(kk.equals(rr));//true
        System.out.println(ll == kk);//true
    }
}
