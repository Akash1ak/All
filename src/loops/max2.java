package loops;

    public class max2
    {
        public static void main(String[] args) {
            int a = 100;
            int b = 120;
            int c = 110;

            if (a > b || b < c)
            {
                System.out.println("120 is greater than 100");
            } else if (b > a && c < b) {
                System.out.println("100 is lesser than 120 and also 110");
            }
            else
            {
                System.out.println("my name is Akash");
            }
        }
    }


