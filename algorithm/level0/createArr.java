package algorithm.level0;

import java.util.*;

public class createArr {
    
    public List<Integer> solution(int l, int r) {
        List<Integer> answer = new ArrayList<>(); // 리스트 타입으로 선언하여 arraylist를 생성
        for (int i = l;i<=r;i++){
            String value = String.valueOf(i);
            boolean flag = true;
            for (char c:value.toCharArray()){
                if (c != '0' && c != '5'){
                    flag = false;
                    break;
                }
            }
            if (flag){
                answer.add(i);
            }
        }
        if (answer.isEmpty()) answer.add(-1);
        return answer;
    }
    public static void main(String[] args) {
        createArr ca = new createArr();
        System.out.println(ca.solution(5, 555));
    }
}
