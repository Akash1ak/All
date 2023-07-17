package immutable;

final class Onee {
    private final String name;

    public String getName() {
        return name;
    }

    Onee(String name) {
        this.name = name;
    }
}

public class one {
    public static void main(String[] args) {
        Onee one = new Onee("Akee");
        System.out.println("Akash");
    }
}
