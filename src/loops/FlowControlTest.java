package loops;

public class FlowControlTest {

    public static void main(String[] args) {
        int a = 100;
        if(a < 100){
            System.out.println("Hurrray");
        } else{
            System.out.println("Not happy");
        }

        int noOfSeats = 250;
        int noOfSeatsWon = 100;
        int majorityMark = 185;
        int noOfMinSeatsRequiredToClaimGovFormation = 120;

        if(noOfSeatsWon >= majorityMark){
            System.out.println("Victory.");
        } else if(noOfSeatsWon <= majorityMark && noOfSeatsWon < noOfMinSeatsRequiredToClaimGovFormation){
            System.out.println("Defeat");
        } else {
            System.out.println("No one is having clear majority");
        }

        //ternary operator
        String dummy ="rrr";
        if(dummy.equals("")){
            dummy= "java";
        } else {
            dummy = "test";
        }
        System.out.println("Outputt is "+dummy);

        String result = dummy.equals("") ? "java" : "test";
        System.out.println("Outputt is "+result);

        //programs
        //ternary operator
        //fail -> percentage < 35
        //pass -> percentage > 35
        //first class -> percentage > 60
        //Distinction  -> percentage > 75

        double percentage = 35;
        if(percentage < 35){
            System.out.println("You have failed in exam");
        } else if(percentage >= 35 && percentage < 60){
            System.out.println("You have passed the exam");
        } else if(percentage > 60 && percentage < 75){
            System.out.println("First class");
        } else{
            System.out.println("Distinction");
        }


        int d = 100;
        if(d > 100){
            d = 200;
        } else{
            d = 300;
        }


        int r =  d > 100 ? 200 : 300;

        String signal = "Red";
        if(signal.equals("Red")){
            System.out.println("Stop the vehicle");
        } else{

        }
    }
}