package core;

public class stringAdd {
    public static void main(String[] args){
        String str = "eternal";
        String str2 = " and immutable";
        String str3 = str + str2; // + 연산을 사용하면 자동적으로 StringBuilder 객체를 생성하고 append() 메서드를 호출한 후 toString() 메서드를 호출하여 문자열을 이어붙임
        String str4 = new java.lang.StringBuffer("eternal").append(" and immutable").toString(); 
        System.out.println(str4);
        System.out.println(str3);

        // 문자열 합치는 방법
        String a = "lov3";
        String b = a + "Sikk";
        String c =a.concat("Sikk"); // concat() 메서드를 사용하여 문자열 이어붙이기
        String d = new java.lang.StringBuffer(a).append("Sikk").toString();
        String e = new java.lang.StringBuilder(a).append("Sikk").toString();
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

    }
    
}
