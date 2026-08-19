package core;

public class Intern{
    public static void main(String[] args){
        String str = "eternal";
        String str2 = "eternal";

        String str3 = new String("immute"); // heap 영역에 생성
        String str4 = "immute"; // heap 영역 내에 string constant pool 영역에 생성

        str3 = str3.intern(); // 해당 문자열 객체를 string constant pool로 이동시키고, 이동된 객체의 주소를 반환

        System.out.println(str3==str4); // true
    }
}