package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class five
{
    public static void main(String[] args) {
       // Set<String> languages= new Collection<>();
        Set<String> languages =new HashSet<>();

        // set the capacity of the arraylist
       // languages.ensureCapacity(3);

        // Add elements in the ArrayList
        languages.add("Java");
        languages.add("Python");
        languages.add("C");
        languages.add("aws");
        languages.add("angular");
        System.out.println("ArrayList: " + languages);
    }

}
