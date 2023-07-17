package String;

public class reva {
    static String a = "Biradar";

    static void rev() {

        String reverse = "";
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            reverse = ch + reverse;
        }
        System.out.println(reverse);
    }

}

class name{

    public static void main(String[] args) {
      reva rv =new reva();
      rv.rev();
         //  rev();

    }
}

