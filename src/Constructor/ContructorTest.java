package Constructor;

class ParentConst{
    ParentConst(){
        System.out.println("Parent class Default Constructor");
    }
    ParentConst(String age){
        this();
        System.out.println("Parent class String parameterized Constructor");
    }
    ParentConst(int age){
        this("Test");
        System.out.println("Parent class with Int parameterized Constructor");
    }
}

public class ContructorTest extends ParentConst {
    ContructorTest(){
        super(12);
        System.out.println("This is Constructor");
    }
    void ContructorTest(){
        System.out.println("This is Method");
    }

    public static void main(String[] args) {
        ContructorTest test = new ContructorTest();
        test.ContructorTest();
    }

}
