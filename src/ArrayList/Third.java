package ArrayList;

import java.util.ArrayList;

public class Third
{
    public static void main(String[] args) {
        ArrayList<String> language =new ArrayList<>();
        language.add("java");
        language.add("python");
        language.add("c++");

        System.out.println("arrayList :"+language);
        System.out.println("size "+language.size());

        System.out.println("contains check :"+language.contains("c++"));  //contains check the element is available in the list or not (True or false)
        language.set(2,"aws");
        System.out.println("new arraylist :"+language);

        String str = language.remove(1);
        System.out.println("updated list :"+language);
    }
}
