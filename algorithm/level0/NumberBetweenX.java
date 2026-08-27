package algorithm.level0;
import java.util.*;

public class NumberBetweenX {
    public int[] solution(String myString) {
    //     String[] s = myString.split("x",-1); // 두번째 인자는 양수일때 최대 크기 지정 음수 일때 마지막 문자까지 포함해서 자름
    //     List<Integer> list = new ArrayList<>();
    //     for (int i= 0;i<s.length;i++){
    //         list.add(s[i].length());
    //     }
    //     int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
    //     return answer;
    // 
        return Arrays.stream(myString.split("x",-1)).mapToInt(String::length).toArray();
    }
    public static void main(String[] args) {
        NumberBetweenX n = new NumberBetweenX();
        System.out.println(Arrays.toString(n.solution("3x5")));
    }
}