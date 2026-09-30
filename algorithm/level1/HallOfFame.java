package algorithm.level1;

import java.util.PriorityQueue;

public class HallOfFame {
    public int[] solution(int k, int[] score) {
//         List<Integer> list = new ArrayList<>();
//         int[] answer = new int[score.length];
//         for (int i = 0;i<score.length;i++){
//             if (i < k){
//                 list.add(score[i]);
//                 list.sort(Comparator.reverseOrder());
//                 answer[i] = list.get(i);
                
//             }
//             else{
//                 if (list.get(k-1) < score[i]){
//                     list.remove(k-1);
//                     list.add(score[i]);
//                     list.sort(Comparator.reverseOrder());
//                 }
//                 answer[i] = list.get(k-1);
//             }
//         }
//         return answer;
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // 최소힙 Collections.reverseOrder()가 붙으면 최대 힙 (최소 최대 가 우선순위가 가장 높은 의미)
        int[] answer = new int[score.length];
        for (int i = 0;i<score.length;i++){
            pq.offer(score[i]);
            if (pq.size() > k){
                pq.poll(); // 우선 순위가 높은 요소 반환 후 제거
            }
            answer[i] = pq.peek(); // 우선 순위가 높은 요소 반환 
        }
        return answer;
    }
    public static void main(String[] args) {
        HallOfFame hf = new HallOfFame();
        int k = 3;
        int[] score = {10,100,20,150,1,100,200};
        int[] answer = hf.solution(k, score);
        for (int i : answer){
            System.out.print(i+" ");
        }
    }
}
