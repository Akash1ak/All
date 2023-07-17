class parent {

    public void addition() {
        int a = 10;
        int b = 20;
        int j = a + b;
        System.out.println("addition is =" + j);
    }

    String company() {
        return "lentra";
    }
}

    class ch extends parent
    {
        public static void main(String[] args) {
            ch c = new ch();
            c.addition();
            c.company();
        }
    }