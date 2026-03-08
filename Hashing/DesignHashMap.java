package Hashing;

import java.util.*;

public class DesignHashMap {

    int[] arr;

    public DesignHashMap() {
        arr = new int[1000001];
        Arrays.fill(arr, -1);
    }

    public void put(int key, int value) {
        arr[key] = value;
    }

    public int get(int key) {
        return arr[key];
    }

    public void remove(int key) {
        arr[key] = -1;
    }

    public static void main(String[] args) {

        DesignHashMap map = new DesignHashMap();
        ArrayList<Object> output = new ArrayList<>();

        output.add(null); // DesignHashMap()
        map.put(1, 1);
        output.add(null);
        map.put(2, 2);
        output.add(null);
        output.add(map.get(1)); // 1
        output.add(map.get(3)); // -1
        map.put(2, 1);
        output.add(null);
        output.add(map.get(2)); // 1
        map.remove(2);
        output.add(null);
        output.add(map.get(2)); // -1

        System.out.println(output);
    }
}
