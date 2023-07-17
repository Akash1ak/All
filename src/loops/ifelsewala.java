package loops;

public class ifelsewala {
    public static void main(String[] args) {


        int pssingMark = 35;
        int totalMark = 100;
        int firstClass = 66;

        if(pssingMark > totalMark)
        {
            System.out.println("pass");
        } else if(pssingMark < totalMark && pssingMark < firstClass )
        {
            System.out.println("failed");
        }
    }
}
