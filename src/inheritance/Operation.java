package inheritance;

public class Operation {
    void add(int a, int b) {
        System.out.println("add= " + (a + b));
    }
}

class Methods extends Operation {
    void sub() {
        System.out.println("sub = " + (10 - 5));
    }
}

class Solution extends Methods {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.add(20, 50);
        solution.sub();
    }
}
