package Static;

class TestSIB{
    static {
        System.out.println("Parent class SIB :::: Static block of TestSIB class ");
    }

    static void dummy(){
        System.out.println("This is Dummy method");
    }

}

class StaticBlockTest extends TestSIB{

    //I want to print something even before main method start execution
    //Method
    //block

    //access modifier returntype methodname(){}
    //static initliaization block(SIB)
    //static{}

    static {
        System.out.println("I am second SIB......");
    }

    static {
        System.out.println("I am the first will which will get executed even before main method");
    }

    StaticBlockTest(){
        System.out.println("Inside constructor, will get called after IIB gets executed.");
    }

    //instance initiazation block
    {
        System.out.println("This is IIB and will get executed after SIB but before Constructor. " +
                "Will get called only if we create an Object of class");
    }
    // SIB > main > (IIB > Constructor > normal methods)

    //static method
    static void test(){
        System.out.println("Running static method.");
    }

    public static void main(String[] args) {
        //Class loaders
        StaticBlockTest test = new StaticBlockTest();
        test();
        //HAS-A
        TestSIB sib = new TestSIB();
        System.out.println("Inside main method, " +
                "this is the first line which will get executed once gets loaded.");

    }
}


//    int noOfSeats = 250;
//    int noOfSeatsWon = 181;
//    int majorityMark = 185;
//
//        if(noOfSeatsWon >= majorityMark){
//                System.out.println("Victory.");
//                } else if(noOfSeatsWon < majorityMark){
//        System.out.println("Defeat");
//        } else {
//        System.out.println("No one is having clear majority");
//        }