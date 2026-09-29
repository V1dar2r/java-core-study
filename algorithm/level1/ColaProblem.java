package algorithm.level1;

public class ColaProblem {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while (n >= a){
            answer += n/a*b;
            n = n%a+n/a*b;
            // System.out.println(answer+" "+n);
        }
        
        return answer;
    }
    public static void main(String[] args) {
        ColaProblem cp = new ColaProblem();
        System.out.println(cp.solution(2,1,20));
    }
}
