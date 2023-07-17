package codingtointerface;

public interface Gun {
    void shoot();
}
class Random implements Gun
{

    @Override
    public void shoot() {
        System.out.println("Aim is great");
    }
}
class Aim {
    public static void main(String[] args) {
        System.out.println("akee");

        Random random = new Random();
        random.shoot();
    }
}
