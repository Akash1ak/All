package immutable;

final class Tree
{
    private final int a=10;

    public int getA() {
        return a;
    }

    Tree(int z)
    {
        System.out.println("this is constructor"+z);
    }

    public static void main(String[] args) {
        Tree tree =new Tree(45);
        tree.getA();
       System.out.println("int value="+tree.getA());
    }

}
