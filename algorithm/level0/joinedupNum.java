package algorithm.level0;

// 주어진 정수 배열에서 홀수와 짝수를 각각 이어붙인 후, 두 수를 더한 값을 반환하는 문제
// 정수를 문자열로 바꾸는 함수 String.valueOf()를 활용하여 홀수와 짝수를 이어붙인 후, Integer.parseInt()를 사용하여 문자열을 정수로 변환하고 더하는 방식으로 구현
public class joinedupNum {
    public int solution(int[] num_list) {
        String oddSum = "";
        String evenSum = "";
        for (int i = 0;i<num_list.length;i++){
            String s = String.valueOf(num_list[i]);
            if (num_list[i]%2 == 0) evenSum+=s;
            else oddSum+=s;
        }
        return Integer.parseInt(evenSum)+Integer.parseInt(oddSum);
    }
    public static void main(String[] args) {
        joinedupNum jn = new joinedupNum();
        System.out.println(jn.solution(new int[]{9, 8, 3, 2, 1}));
    }
    
}
