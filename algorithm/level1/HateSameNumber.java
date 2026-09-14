package algorithm.level1;
import java.util.*;

public class HateSameNumber {
    public int[] solution(int []arr) {
        Stack<Integer> s = new Stack<>();
        for (int n:arr){
            if (s.isEmpty() || s.peek() != n){
                s.push(n);
            }
            
        }
        int[] answer = new int[s.size()];
        for (int i=answer.length-1;i>=0;i--){ // for문 stack 사이즈를 직접 사용 x
            answer[i] = s.pop();
        }
        return answer;
    }
    public static void main(String[] args) {
        HateSameNumber hsn = new HateSameNumber();
        int[] arr = {1,1,3,3,0,1,1};
        System.out.println(Arrays.toString(hsn.solution(arr)));
    }
}