package algorithm.level1;

import java.util.Arrays;

public class Budget{
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int answer = 0;
        for (int i = 0;i<d.length;i++){
            if (budget>=d[i]){
                budget-=d[i];
                answer++;
            }
            else{
                break;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Budget b = new Budget();
        int result = b.solution(new int[]{1,3,2,5,4}, 9);
        System.out.println(result);
    }
}