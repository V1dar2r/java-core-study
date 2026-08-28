package core;
import java.util.*;
public class genericEx {
    // public static void printList(List<> list){
    //     for(Object obj : list){
    //         System.out.println(obj);
    //     }
    // }
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        List<Object> list2 = new ArrayList<>();
        // list = list2; // 컴파일 에러 발생 -> 제네릭 타입은 공변성과 반공변성 즉 상속관계가 성립되지 않음(object로 문자열이 들어오면 list가 처리할 수 없어 런타임 에러 발생)
        // list2 = list;  따라서 업캐스팅과 다운캐스팅이 불가능함
        List<Integer> list3 = Arrays.asList(1,2,3,4,5);
        // printList(list3); // 컴파일 에러 발생 -> 매개변수의 제네릭 타입을 고정으로 하거나 오버로딩하여 다른 타입도 처리해야하는 불편함이 있음
    }
}
