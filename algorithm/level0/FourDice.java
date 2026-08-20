package algorithm.level0;

import java.util.Arrays;

public class FourDice {
    public int solution(int a, int b, int c, int d) {
        int list[] = {a,b,c,d}; // 배열에 주어진 4개의 정수를 저장
        Arrays.sort(list); // 배열을 오름차순으로 정렬하여 중복된 값들을 쉽게 비교
        if (list[0]==list[3]){ // 모든 값이 동일한 경우
            return 1111*list[0];
        }
        // 세 개의 주사위 값이 동일한 경우
        else if (list[0] == list[2]){ 
            return (int)Math.pow(10*list[0]+list[3],2);
        }
        else if (list[1]==list[3]){
            return (int)Math.pow(10*list[1]+list[0],2);
        }
        // 두 쌍의 주사위 값이 동일한 경우
        else if (list[0] ==list[1] && list[2] == list[3]){
            return (list[0]+list[2])*Math.abs(list[2]-list[0]);
        }
        // 두 개의 주사위 값이 동일한 경우
        else if (list[0] == list[1] || list[1] == list[2] || list[2] == list[3]){
            if (list[0]==list[1]){
                return list[2]*list[3];
            }
            else if (list[1]==list[2]){
                return list[0]*list[3];
            }
            else{
                return list[0]*list[1];
            }
        }
        // 모든 주사위 값이 서로 다른 경우
        else{
            return list[0];
        }
    }
    public static void main(String[] args){
        FourDice fd = new FourDice();
        System.out.println(fd.solution(3, 5, 2, 3));
    }
}
