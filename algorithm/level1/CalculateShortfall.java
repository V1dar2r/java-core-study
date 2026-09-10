package algorithm.level1;

public class CalculateShortfall{
    public long solution(int price, int money, int count) {
        long answer = money; // 오버플로우
        for (int i=1;i<=count;i++){
            answer-=price*i;
        }
        return answer < 0 ? -answer : 0;
    }
    public static void main(String[] args) {
        CalculateShortfall b = new CalculateShortfall();
        long result = b.solution(3, 20, 4);
        System.out.println(result);
    }   
}