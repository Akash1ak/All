package Pattern;

public class diamond
{
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i < n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print(" *");
            }
            for (int j = 1; j < i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++)
        {
            for(int j =1;j<=i;j++)
            {
                System.out.print("  ");
            }
            for(int j=i;j<=n;j++)
            {
                System.out.print(" *");
            }
            for(int j=i;j<n;j++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
//        int n = 5;
//        for (int i = 1; i < n; i++) {
//            for (int j = i; j <= n; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for (int m = 1; m <= n; m++) {
//            for (int j = 1; j <= m; j++) {
//                System.out.print(" ");
//            }
//            for (int j =m; j < n; j++) {
//                System.out.print(" *");
//            }
//            System.out.println();
//        }
    }
}
