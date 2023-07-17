package codingtointerface;



interface Signal
{
    void getColour(String Colour);
}

public class Test implements Signal{
    @Override
    public void getColour(String Colour) {
        System.out.println("stop signal is"+Colour);
    }
}

class Stop
{
    public static void main(String[] args) {
        Test test = new Test();
        test.getColour(" Red");

    }
}
