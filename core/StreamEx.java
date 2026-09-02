package core;

import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class StreamEx {
    public static void main(String[] args){
        List<List<Integer>> list2 = Arrays.asList(Arrays.asList(1,2,3), Arrays.asList(4,5,6), Arrays.asList(7,8,9));
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Stream<Integer> stream = list.stream(); // stream 생성(collection)
        List<String> fruits = Arrays.asList("apple", "banana", "cherry", "avocado");
        int[] arr = {3,2,5,125,323,213,12,143,5,214};
        Arrays.stream(arr); // stream 생성(배열)
        Stream.of(1,2,3,4,5); // 직접 stream 생성
        Arrays.stream(arr).filter(s->s%2==0); // filter: 데이터 필터링
        list.stream().map(s->s*2); // map: 데이터 변환
        Arrays.stream(arr).sorted(); // sorted: 데이터 정렬
        Arrays.stream(arr).distinct(); // distinct: 중복 제거
        Arrays.stream(arr).limit(3); // 몇번째 까지 가져올지 제한
        Arrays.stream(arr).skip(3); // 몇번째 이후부터 가져올지 제한
        Arrays.stream(arr).boxed().collect(Collectors.toList()); // collect: 특정 자료 구조나 형태로 변환 (원시 타입으로 stream을 만들면 boxed()를 통해 객체 타입으로 변환하여 list에 저장)
        // boxed: 원시 타입을 객체 타입 stream으로 변환
        Arrays.stream(arr).reduce(0, (a, b) -> a + b); // reduce: 데이터를 소모하여 단일 값으로 변환
        fruits.stream().collect(Collectors.joining(",")); // joining: 문자열 합치기
        fruits.stream().collect(Collectors.groupingBy(s -> s.charAt(0))); // groupingBy: 특정 기준으로 그룹화
        fruits.stream().anyMatch(s-> s.equals("apple")); // anyMatch: 조건에 맞는 데이터가 하나라도 있는지 확인
        fruits.stream().allMatch(s -> s.startsWith("a")); // allMatch: 조건에 맞는 데이터가 모두 있는지 확인
        Optional<String> firstFruit = fruits.stream().findFirst(); // 첫번째 데이터 가져오기 - optional로 가져오는 이유는 값이 없을 수도 있기 때문에
        list2.stream().flatMap(Collection::stream); // flatMap: 2차원 배열을 1차원 배열로 변환
        list.parallelStream().reduce(0, (a,b) -> a+b); // parallelStream: 병렬 처리
        list.parallelStream().forEach(n -> System.out.print(n + " ")); // forEach: stream의 각 요소에 대해 반복 작업 수행
    }
}
