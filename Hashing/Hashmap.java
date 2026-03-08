package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmap {
    public static void main(String args[]) {
        // Country(key),Population(value)
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 120);
        map.put("USA", 30);
        map.put("China", 150);
        System.out.println(map);
        map.put("Indonesia", 100);
        System.out.println(map);

        if (map.containsKey("Newzealand")) { // checking if key is present or not
            // int population=map.get("India");
            System.out.println("key found");
        } else {
            System.out.println("Key not found");
        }
        System.out.println(map.get("India"));// checking value for key =120
        System.out.println(map.get("Newzealand")); // null

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " " + map.get(key));
        }

        map.remove("India");
        System.out.println(map);

    }
}
