package core;

import java.util.*;

public class genericEx1 {
    public static void main(String[] args) {
    // MyArrayList의 제네릭 T 타입은 Number
    MyArrayList<Number> list; // 초기 객체가 생성될 때 타입이 Number로 고정됨

    // MyArrayList 생성하기
    Collection<Number> col = Arrays.asList(1, 2, 3, 4, 5);
    list = new MyArrayList<>(col);

    // LinkedList 에 MyArrayList 요소들 복사하기
    List<Object> temp = new LinkedList<>();
    list.clone(temp); // temp 요소들을 number 타입으로 변환하여 MyArrayList에 복사

}
    
}

class MyArrayList<T> {
    Object[] element = new Object[5];
    int index = 0;

    // 외부로부터 리스트를 받아와 매개변수의 모든 요소를 내부 배열에 추가하여 인스턴스화 하는 생성자
    public MyArrayList(Collection<? extends T> in) {   // ? extends T를 사용하여 매개변수의 제네릭 타입이 T의 하위 클래스일 경우에도 처리 가능
        for (T elem : in) {
            element[index++] = elem;
        }
    }

    // 외부로부터 리스트를 받아와 내부 배열의 요소를 모두 매개변수에 추가해주는 메서드
    public void clone(Collection<? super T> out) {
        for (Object elem : element) {
            out.add((T) elem);
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(element); // 배열 요소들 출력
    }
    
}