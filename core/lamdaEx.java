package core;

interface Addable{ // 인터페이스를 통해 함수에 대한 타입 정의
    int add(int x,int y);
}
public class lamdaEx {
    int add(int x,int y){
        return x+y;
    }

    public static void main(String[] args) {
        Addable ad1 = (a,b) -> (a+b); // 람다식으로 구현
        int n = result((x,y) ->(x+y)); // 바로 입력값 매개변수로 전달
        System.out.println("Result: " + n);
        System.out.println("Result: " + ad1.add(10, 20));
        lamdaEx obj = new lamdaEx();
        Addable ad2 = result2(); // 람다식으로 반환된 객체를 참조변수에 저장
        int r = ad2.add(10,20);
        System.out.println("Result: " + r);
        System.out.println("Result: " + obj.add(5, 10));
    }
    public static int result(Addable ad){
        return ad.add(10, 20);
    }
    public static Addable result2(){
        return (x,y) -> (x+y); // 람다식으로 반환도 가능
    }
}