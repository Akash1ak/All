package StringPartice;

public class Five
{
    public static void main(String[] args) {
        String ii = new String("add");
        String jj = "add";
        String kk = new String("add");
        String ll =new String("add");
        System.out.println(ll==kk);//false
        System.out.println(ii==ll);//false
        System.out.println(kk.equals(jj));//true
        System.out.println(jj == kk);//false
        System.out.println(ll.equals(kk));//true
        System.out.println(ll.equals(jj));///true
    }
}
