package Pattern;

public class aa {

    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++)        //1to n and 1 to i
        {
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int i = 1; i < n; i++)        //1to n and i to n
        {
            for (int j = i; j < n; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}

