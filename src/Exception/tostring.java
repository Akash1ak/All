package Exception;

public class tostring {
    public static void main(String args[]) {
        int a = 23;
        int b = 0;
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
        }
    }
}
