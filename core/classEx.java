package core;

class character{
    static String name = "eternal"; // 클래스 변수
    int Hp = 300; // 인스턴스 변수
    int method(){
        Hp = 100; // 지역 변수
        return Hp;
    }
    int method(int a){ // 오버로딩 매개변수가 다르면 오버로딩, 매개변수가 같고 반환값이 다른 경우에는 오버로딩이 아님
        Hp = a;
        return Hp;
    }
    static int method2(int a,int b){
        return a+b;
    }
}
public class classEx {
    public static void main(String[] args){
        System.out.println(character.method2(5, 10)); // 클래스 메서드는 객체 생성과 상관없이 이름으로 접근 가능하지만 인스턴스 변수를 사용 불가
        System.out.println(character.name); // 클래스 변수는 객체 생성 없이 클래스 이름으로 접근 가능
        character c1 = new character();
        character c2 = new character();
        character c3 = new character();
        System.out.println(c1.Hp);
        System.out.println(c1.method());
        c1.Hp = 200;
        c2.Hp = 400;
        c3.Hp = 600;
        System.out.println(c1.Hp); // 인스턴스 변수는 객체마다 별도로 존재
        System.out.println(c2.Hp);
        System.out.println(c3.Hp);
        c1.name = "eternal2"; 
        c2.name = "eternal3";
        c3.name = "eternal4";
        System.out.println(c1.name); // 클래스 변수는 모든 객체가 공유함
        System.out.println(c2.name);
        System.out.println(c3.name);
        System.out.println(character.name); // 클래스 변수는 클래스 이름으로 접근해야함

    }
}
