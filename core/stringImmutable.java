package core;

public class stringImmutable{
    public static void main(String[] args){
        String str = "eternal";
        // hashcode() 메서드는 객체의 메모리 번지를 이용해 해시코드를 생성해서 반환하는 메서드  
        System.out.println(str.hashCode());  // 1178956460
        str= str + " and immutable";
        System.out.println(str.hashCode()); // 2041126917
        // 문자열이 변경되면 새로운 객체가 생성됨 -> 문자열은 불변 객체
    }
}