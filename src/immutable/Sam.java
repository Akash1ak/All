package immutable;

final class Sam {
    private final String h ="ok done ";

    public String getH() {
        return h;
    }
    Sam(String j)
    {
        System.out.println("this is a constructor");
    }

    public static void main(String[] args) {
        Sam sm = new Sam("carry on");
        System.out.println(sm.getH());
    }
}
