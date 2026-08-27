package core;
import java.util.*;
public class HashSetEx {
    public static void main(String[] args){
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        set.add(1);
        set.add(30);
        set2.add(2);
        set2.add(40);
        set.remove(1);
        System.out.println(set);
        set.addAll(set2);
        System.out.println(set.contains(set2));
        System.out.println(set.isEmpty());
        set.retainAll(set2);
        System.out.println(set);
        System.out.println(set2);
    }
}
