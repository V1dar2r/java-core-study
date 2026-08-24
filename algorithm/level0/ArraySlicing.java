package algorithm.level0;

import java.util.ArrayList;
import java.util.List;

public class ArraySlicing {
    public int[] solution(int[] arr, int[] query) {
        List<Integer> list = new ArrayList<>();
        for (int num: arr){
            list.add(num);
        }
        for (int i = 0;i<query.length;i++){
            int n = query[i];
            if (i % 2 ==0){ // 이것도 같이 인덱스 실수
                list.subList(n+1,list.size()).clear();
            }
            else{
                list.subList(0,n).clear(); // 이것도 사용
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0;i<list.size();i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
    public static void main(String[] args) {
        ArraySlicing as = new ArraySlicing();
        int[] arr = {0, 4, 5, 3, 3, 5};
        int[] query = {4, 1, 2};
        int[] result = as.solution(arr, query);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
    
}
