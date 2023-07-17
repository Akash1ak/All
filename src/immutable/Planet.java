package immutable;

final class Planet
{
    private final String ok ="Akee";

    public String getOk() {
        return ok;
    }

    Planet(String ok)
    {
        System.out.println("this is constructor");
    }
//    void m1()
//    {
//        System.out.println("this is normal method");
//    }

    public static void main(String[] args) {
        Planet planet =new Planet("save it");
        planet.getOk();
        System.out.println("planet is our mothrt plz");
    }
}
