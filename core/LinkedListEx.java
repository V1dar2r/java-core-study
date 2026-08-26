package core;

import java.util.LinkedList;
import java.util.*;
import java.util.Arrays;

public class LinkedListEx {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>(Arrays.asList(1,2,412,213,123,412)); // Arrays.asList()를 이용하여 배열을 넣어 초기화

        list.addFirst(10); // list의 맨 앞에 10을 추가

        list.addLast(30); // list의 맨 뒤에 30을 추가

        list.add(20); // list의 맨 뒤에 20을 추가


        list.add(1,15); // list의 1번째 index에 15를 추가 중간 삽입은 LinkedList가 ArrayList보다 빠름

        list2.addAll(list); // list2에 list의 모든 요소를 추가

        int[] arr= list.stream().mapToInt(Integer::intValue).toArray(); // wrapper 클래스로 바로 변환 불가능하여 stream을 이용하여 int[]로 변환

        list.removeFirst(); // list의 맨 앞의 요소를 제거

        list.removeLast(); // list의 맨 뒤의 요소를 제거

        list.remove(1); // list의 1번째 index의 요소를 제거

        list.removeAll(list2); // list의 모든 요소 중 list2에 있는 요소를 제거

        List<Integer> l1 = Collections.synchronizedList(list);
        List<Integer> l2 = Collections.synchronizedList(list2);

    }
}
