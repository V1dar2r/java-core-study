package algorithm.level0;

import java.util.ArrayList;
import java.util.List;

public class MakingTheLengthOfAnArrayAPowerOf2 {
    public int[] solution(int[] arr) {
        //List<Integer> list = new ArrayList<>(Arrays.asList(arr));//
        List<Integer> list = new ArrayList<>();
        for (int n:arr){
            list.add(n);
        }
        int cnt = 1;
        while (cnt < list.size()){
            cnt*=2;
        }
        for (int i = list.size();i<cnt;i++){
            list.add(0);
        }
        int[] answer = new int[list.size()];
        for (int i = 0;i<list.size();i++){
            answer[i]=list.get(i);
        }
        return answer;
    }
    public static void main(String[] args) {
        MakingTheLengthOfAnArrayAPowerOf2 makingTheLengthOfAnArrayAPowerOf2 = new MakingTheLengthOfAnArrayAPowerOf2();
        int[] arr = {58, 172, 746, 89};
        int[] result = makingTheLengthOfAnArrayAPowerOf2.solution(arr);
        for (int n : result) {
            System.out.print(n + " ");
        }
    }
}
