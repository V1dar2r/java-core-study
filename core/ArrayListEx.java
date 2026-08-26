package core;

import java.util.*;

public class ArrayListEx {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>(10);
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4)); // Arrays.asList()를 이용하여 배열을 넣어 초기화
        ArrayList<Integer> list4 = new ArrayList<>(list3);
        list.add(10);

        list.add(20); // list에 data 추가

        list2.addAll(list); // list2에 list의 모든 요소를 추가

        list.add(3,30); // list의 3번째 index에 30을 추가

        list2.addAll(2,list); // list2의 2번째 index에 list의 모든 요소를 추가

        list.remove(0); // list의 0번째 index의 요소를 제거

        list.retainAll(list2); // list의 모든 요소 중 list2에 있는 요소만 남기고 제거

        list.removeAll(list2); // list의 모든 요소 중 list2에 있는 요소를 제거

        list.add(1);
        list.add(2);
        list.add(3);

        list.contains(1); // list에 1이 있는지 확인, 있으면 true, 없으면 false 반환 배열도 가능

        list.indexOf(2); // list에서 2의 index를 반환, 없으면 -1 반환 (정방향으로 탐색)

        list.lastIndexOf(3); // list에서 3의 마지막 index를 반환, 없으면 -1 반환(역순으로 탐색)

        list.get(2); // list의 2번째 index의 요소를 반환

        list.subList(0,3); // list의 0번째 index부터 2번째 index까지의 요소를 반환

        list.set(0,100); // list의 0번째 index의 요소를 100으로 변경

        list.ensureCapacity(10); // list의 용량을 10으로 변경

        List<Integer> cloneNum = (List<Integer>) list.clone(); // list를 복제하여 cloneNum에 저장

        int[] arr = cloneNum.stream().mapToInt(Integer::intValue).toArray(); // wrapper 클래스로 바로 변환 불가능하여 stream을 이용하여 int[]로 변환

        list.sort(Comparator.naturalOrder()); // list를 오름차순으로 정렬

        list.sort(Comparator.reverseOrder()); // list를 내림차순으로 정렬

        Iterator<Integer> it = list.iterator(); // 단방향 이동만 가능
        while(it.hasNext()){ // list의 요소를 순차적으로 접근
            System.out.println(it.next()); // list의 요소를 순차적으로 출력
        }

        ListIterator<Integer> lit = list.listIterator(); // 양방향 이동 가능
        while(lit.hasNext()){ // list의 요소를 순차적으로 접근
            System.out.println(lit.next()); // list의 요소를 순차적으로 출력
        }
        while(lit.hasPrevious()){ // list의 요소를 역순으로 접근
            System.out.println(lit.previous()); // list의 요소를 역순으로 출력
        }
        
        list.clear(); // list의 모든 요소를 제거
    }

}
