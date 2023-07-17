package Encapsulation;

public class Tree
{
    private int treeNo;
    private int Type;

    public int getTreeNo() {
        return treeNo;
    }

    public void setTreeNo(int treeNo) {
        this.treeNo = treeNo;
    }

    public int getType() {
        return Type;
    }

    public void setType(int type) {
        Type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return Species;
    }

    public void setSpecies(String species) {
        Species = species;
    }

    private String name;
    private String Species;
}
class environment
{
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.setName("neem");
        tree.setSpecies("Aureveda");
        tree.setTreeNo(109);
        tree.setType(34);

        System.out.println("tree name "+tree.getName());
        System.out.println("tree Species "+tree.getSpecies());
        System.out.println("tree no "+tree.getTreeNo());
        System.out.println("tree type "+tree.getType());
    }
}
