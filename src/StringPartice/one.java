package StringPartice;

public class one
{
    public static void main(String[] args) {
        String st =new String("java");
        String st1 = new String("java");
        String s = "java";
        String s1 = "java";
        System.out.println(s==s1);//true
        System.out.println(st1 == st); //false
        System.out.println(st.equals(s1)); //true
    }
}
