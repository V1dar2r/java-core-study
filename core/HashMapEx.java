package core;

import java.util.*;
public class HashMapEx {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Sikk", 25);
        map.put("Swings", 30);
        map.put("EK", 35);
        map.put("Sikk", 40); // key 중복시 value 값이 덮어씌워짐
        map.put("null", 50);
        map.put("Jmin", 10);
        map.put("slayer", 100);
        System.out.println(map);
        System.out.println(map.get("Sikk"));
        System.out.println(map.containsKey("Swings"));
        System.out.println(map.containsValue(35));
        map.remove("EK");
        System.out.println(map);
    }
}
