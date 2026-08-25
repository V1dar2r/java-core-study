package algorithm.level0;

import java.util.ArrayList;
import java.util.List;

public class FromTheNth {
    public int[] solution(int[] num_list, int n) {
        List<Integer> list = new ArrayList<>();
        for (int i=n-1;i<num_list.length;i++){
            list.add(num_list[i]);
        }
        // int[] answer = new int[list.size()];
        // for (int i =0;i<list.size();i++){ // 복사만 하는 경우에는 for문이 빠름
        //     answer[i] = list.get(i);
        // }
        int [] answer = list.stream().mapToInt(Integer::intValue).toArray(); // list를 int 배열로 전환
        return answer;
    }
    public static void main(String[] args) {
        FromTheNth ftn = new FromTheNth();
        int[] result = ftn.solution(new int[]{1, 2, 3, 4, 5}, 3);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
