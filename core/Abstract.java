package core;

abstract class transport{ // 추상 클래스를 통해 공통된 기능과 변수를 정의하고, 상속을 통해 구체적인 기능을 구현하도록 함
    public int cost;
    public transport(int cost){
        this.cost = cost;
    }
    abstract public void move();
    abstract public void sound();
}

class Bus extends transport{ // 추상 클래스의 상속을 받으면 추상 메서드를 반드시 구현해야함
    public int capacity;
    public Bus(int cost, int capacity){
        super(cost);
        this.capacity = capacity;
    }
    public void move(){
        System.out.println("bus move");
    }
    public void sound(){
        System.out.println("bus sound");
    }
}

class Train extends transport{
    public int capacity;
    public Train(int cost, int capacity){
        super(cost); // 직접 추상 클래스를 생성할 순 없지만 super 키워드를 통해서 추상 클래스의 생성자 호출 가능
        this.capacity = capacity;
    }
    public void move(){
        System.out.println("train move");
    }
    public void sound(){
        System.out.println("train sound");
    }
}

public class Abstract{
    public static void main(String[] args){
        transport t1 = new Bus(100, 50);
        transport t2 = new Train(200, 100);

        t1.move();
        t1.sound();

        t2.move();
        t2.sound();
    }
}