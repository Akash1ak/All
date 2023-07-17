package inheritance;

public class Watch {
    public void time(String season, int a, int b) {
        System.out.println("in " + season + " heat timimg is " + a + " to " + b);
    }
}

class Summer extends Watch {
    public void care() {
        System.out.println("So drink more water and stay hydrated");
    }
}

class indGov extends Summer {
    public static void main(String[] args) {
        indGov indgov = new indGov();
        indgov.time("Summer", 12, 4);
        indgov.care();
    }
}
