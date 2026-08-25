package core;

interface Rapper{
    public void rap();
    default void trap(){ // default 메서드는 상속받아서 재정의 가능
        System.out.println("trap");
    }
    static void beat(){ // static 메서드는 인터페이스 이름으로 바로 호출
        System.out.println("beat");
    }
    private static void privateMethod(){ // private 메서드는 인터페이스 내에서만 사용 가능
        System.out.println("private method");
    }
    static void privateStaticMethod(){ // private static 메서드는 인터페이스 내에서만 사용 가능
        privateMethod();
    }
}
interface singer{
    public void sing();
}
class player{
    public void play(){
        System.out.println("play");
    }
}
abstract interface artist extends singer, Rapper{  // interface는 다중 상속 가능, abstract 키워드 생략 가능
}
class KC extends player implements Rapper, singer{ // interface는 구현 가능
    public void rap(){
        System.out.println("kc rap");
    }
    public void sing(){
        System.out.println("kc sing");
    }
    public void play(){
        System.out.println("kc play");
    }
}
public class Interface {
    public static void main(String[] args){
        KC k = new KC();
        k.rap();
        k.sing();
        k.play();
    }
}
