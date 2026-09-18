package algorithm.level1;

import java.util.HashMap;

public class NearestSameLetter {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
//         for (int i = 0;i<s.length();i++){
//             answer[i] = -1;
//             for (int j = i-1;j>=0;j--){
//                 if (s.charAt(i) == s.charAt(j)){
//                     answer[i] = i-j;
//                     break;
//                 }
//             }

//         }
        HashMap<Character,Integer> m = new HashMap<>();
        for (int i = 0;i<s.length();i++){
            // if (m.containsKey(s.charAt(i))){
            //     answer[i] = i - m.get(s.charAt(i));
            //     m.put(s.charAt(i),i);
            // }
            // else{
            //     answer[i] = -1;
            //     m.put(s.charAt(i),i);
            // }
            char ch = s.charAt(i);
            answer[i] = i-m.getOrDefault(ch,i+1); // hashmap에 값이 존재하면 value,아니면 설정 값으로 반환
            m.put(ch,i);
        }
        return answer;
    }
    public static void main(String[] args) {
        NearestSameLetter n = new NearestSameLetter();
        int[] answer = n.solution("banana");
        for (int i : answer){
            System.out.print(i+" ");
        }
    }
}

