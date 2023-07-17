package StringPartice;

public class four {
    public static void main(String[] args) {

            String aa = "Akash ";
            String bb = new String("akash");
            String cc = new String("Akash");
            String dd = "akash";
            String ee = new String("Biradar");
            String ff = "Biradar";
            System.out.println(aa == bb);//false
            System.out.println(aa.equals(cc));//false
        System.out.println(dd == bb);//false
        System.out.println(dd.equals(bb));//true
        System.out.println(ee.equals(ff));//true


    }
}
