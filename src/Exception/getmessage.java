package Exception;

public class getmessage {
    public static void main(String args[]) {
        int a = 89;
        int b = 0;
        try {
            System.out.println(a / b);
        } catch (ArithmeticException r) {
            System.out.println(r.getMessage());
        }
    }
}
