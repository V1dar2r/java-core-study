package core;

public class stringDefine {
    public static void main(String[] args){
        // 문자열 리터럴과 new 연산자로 생성한 문자열 객체의 비교
        String str ="eternal"; // 문자열 리터럴로 생성
        String str1 = "eternal"; // 문자열 리터럴로 생성
        // 문자열 리터럴로 생성된 문자열은 동일한 문자열인 경우 같은 객체를 참조함

        // new 연산자로 생성한 문자열 객체는 동일한 문자열이라도 각각 객체를 따로 생성하기 때문에 서로 다른 객체를 참조함
        String str2 = new String ("eternal"); // new 연산자로 생성
        String str3 = new String ("eternal"); // new 연산자로 생성

        System.out.println(str==str1); // true
        System.out.println(str2==str3); //false
        // 문자열 객체의 내용 비교는 equals() 메서드를 사용해야 함
        System.out.println(str.equals(str2)); // true
        System.out.println(str==str3); // false
    }
}
