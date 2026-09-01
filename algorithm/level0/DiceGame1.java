package algorithm.level0;

public class DiceGame1 {
    public int solution(int a, int b) {
        if (a%2 == 1 && b%2 == 1){
            return (int) Math.pow(a,2)+(int) Math.pow(b,2); 
        }
        else if (a%2 == 1 || b%2 == 1){
            return 2*(a+b);
        }
        else{
            return Math.abs(a-b);
        }
    }
    public static void main(String[] args) {
        DiceGame1 dg = new DiceGame1();
        System.out.println(dg.solution(3, 5));
        System.out.println(dg.solution(6, 3));
        System.out.println(dg.solution(2, 4));
    }
}
