package loops;

public class alphabet {
    public static void main(String[] args) {

        char alpha = 'x';

        if ((alpha >= 'a' && alpha <= 'z') || (alpha >= 'A' && alpha <= 'Z'))
            System.out.println(alpha + " is an alphabet.");
        else
            System.out.println(alpha + " is not an alphabet.");
    }
}
