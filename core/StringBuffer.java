package core;

public class StringBuffer {
    public static void main(String[] args){
        String str ="abcdefg"; 
        java.lang.StringBuffer sb = new java.lang.StringBuffer(str); // StringBuffer 객체 생성 초기 크기 16
        java.lang.StringBuffer sb2 = new java.lang.StringBuffer("abcdefg"); 

        System.out.println(sb == sb2);

        System.out.println(sb.equals(sb2)); // StringBuffer 객체는 equals() 메서드가 오버라이딩 되어있지 않음 -> 주소값 비교 비교하려면 toString() 메서드를 사용해야 함

        System.out.println(sb.capacity()); // StringBuffer 객체의 초기 용량 확인

        System.out.println(sb.toString()); // StringBuffer -> String 변환

        System.out.println(sb.substring(2,4)); // 문자열 일부 추출

        System.out.println(sb.insert(3,"dddd")); // 문자열 삽입

        System.out.println(sb.charAt(0));

        System.out.println(sb.deleteCharAt(0));

        System.out.println(sb.delete(3,7)); // 문자열 삭제

        System.out.println(sb.append("h")); // 문자열 이어붙이기

        System.out.println(sb.reverse()); // 문자열 뒤집기

        System.out.println(sb.length()); // 문자열 길이 확인

        System.out.println(sb.capacity());   // StringBuffer 객체의 용량 확인
    } 
    
}
