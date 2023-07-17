public class bike
{
    private void co()
    {
        boolean b =true;
        int model = 76276878;
    }
    public void honda()
    {
        int price = 120000;
        String model = "bs6";
        float avg =46.8f;
        System.out.println("bike price is "+price + " model "+ model + " avg "+avg);
    }
}
class engin extends bike
{
    public static void main(String[] args) {
        bike be =new bike();
       // be.co();    error getting because method is private
        be.honda();
    }
}
