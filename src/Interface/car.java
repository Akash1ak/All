package Interface;

 interface car
{
   abstract void bmw();

}
interface bike extends car
{
    abstract void honda();
}
 class Abcd implements car,bike {

     @Override
     public void bmw() {
         System.out.println("it is so expensive");

     }

     @Override
     public void honda() {

     }
 }

   abstract class xyz extends Abcd //implements car,bike
     {
         public static void main(String[] args) {
             Abcd xy =new Abcd() ;
             xy.bmw();
         }

     }

