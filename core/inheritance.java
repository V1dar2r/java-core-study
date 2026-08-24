package core;

class Character{
    int Hp = 100;
    int attack;
    int speed;
    int defense;
    Character(int Hp, int attack, int speed, int defense){  
        this.Hp = Hp;
        this.attack = attack;
        this.speed = speed;
        this.defense = defense;
        System.out.println("Character 생성자");
    }
    void move(){
        System.out.println("move");
    }
};

class Warrior extends Character{
    int Hp =200;
    Warrior(int Hp, int attack, int speed, int defense){
        // super 생략되어있음 -> 부모 클래스의 생성자를 호출하는 코드가 생략되어있음
        // 부모 클래스에 생성자가 정의되어있으면 생성자 별도 호출
        super(Hp, attack, speed, defense); // 부모 클래스 생성자 호출
        System.out.println("Warrior 생성자");
        // super 키워드로 자식 클래스와 부모 클래스에서 이름이 같은 인스턴스 변수 구분
        System.out.println(super.Hp); // 부모 인스턴스 변수 접근
        System.out.println(this.Hp); // 자식 인스턴스 변수 접근
        System.out.println(Hp); // 지역 인스턴스 변수 접근
    }
    void Rampage(){};
    
    void move(){ // 오버라이딩
        System.out.println("Warrior move");
    }
    void move(int a){ // 오버로딩
        System.out.println("Warrior move"+a+"칸");
    }
    int rage;
};

class assassin extends Character{
    assassin(){
        super(80, 40, 50, 10); // 부모 클래스 생성자 호출
        System.out.println("assassin 생성자"); 
    }
    int critical;
    void backstab(){};
};

public class inheritance {
    public static void main(String[] args){
        Warrior w1 = new Warrior(100, 50, 30, 20); // 부모 클래스 생성자 먼저 호출되고 자식 클래스 생성자가 호출됨(부모 클래스가 먼저 인스턴스화)
        w1.rage = 100;

        assassin a1 = new assassin();
        a1.critical = 100;
    }
}
