package ArrayList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class fist
{
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(90);
//        list.add(88);
//        System.out.println("intlist :"+list);

        Map<String, String> map = new HashMap<>();
        map.put("123", "ABCD");
        map.put("124", "ABCD1");
        map.put("126", "ABCD2");
        map.put("127", "ABCD3");

        map.put(null, "ABVD766756");
        System.out.println("ABVD766756  " +map.get(null));   //ABVD766756
        map.put(null, "ABVD99");
        System.out.println("ABVD99  " + map.get(null));  //ABVD99
        map.put(null, "ABVD66");
        System.out.println(map.get(null)); //
        map.put(null, "ABVD55");
        System.out.println(map.get(null));  //
        map.put(null, "ABVD234");

        System.out.println(map.get(null));  //ABVD234
        System.out.println(map.size());
    }

}
