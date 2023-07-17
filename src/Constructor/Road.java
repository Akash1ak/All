package Constructor;

class Road
{
    int km;
    String roadName;
    Road()
   {
       System.out.println("this is a constructor");
   }

    public static void main(String[] args) {
        Road road = new Road();
        System.out.println(road.km);
        System.out.println(road.roadName);
    }
}
