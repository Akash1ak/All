package String;

public class ulta
{
    void rev(String a)
    {
        String reverse = "";
        for(int i =0;i<a.length();i++) {
            char ch = a.charAt(i);
            reverse = ch + reverse;
        }
        System.out.println(reverse);
    }

    public static void main(String[] args) {
        ulta ut =new ulta();
        ut.rev("CSK");
    }
}

