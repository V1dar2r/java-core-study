package algorithm.level0;

import java.util.ArrayList;
import java.util.List;

public class createArr2 {
    public List<Integer> solution(int l, int r) {
        List<Integer> answer = new ArrayList<>(); // list 타입 
        // list는 인터페이스로 구현체로는 ArrayList, LinkedList 등이 있음
        // ArrayList는 가변 크기 배열로 구현되어 있으며 저장데이터는 wrapper 클래스 타입으로 저장됨
        for (int i = l;i<=r;i++){
            String value = String.valueOf(i); // 문자열로 변환
            boolean flag = true;
            for (char c:value.toCharArray()){ // 문자열을 char 배열로 변환하여 각 자리수를 확인
                if (c != '0' && c != '5'){ // 0이나 5가 아닌 경우 flag를 false로 변경하고 반복문 종료
                    flag = false;
                    break;
                }
            }
            if (flag){ // flag가 true인 경우 answer 리스트에 추가
                answer.add(i);
            }
        }
        if (answer.isEmpty()) answer.add(-1); // 예외 상황 처리
        return answer;
    }
    public static void main(String[] args){
        createArr2 ca = new createArr2();
        System.out.println(ca.solution(200, 5000));
    }
    
}
