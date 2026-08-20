package algorithm.level0;

public class StringReverse {
    public String solution(String my_string, int[][] queries) {
        StringBuilder sb = new StringBuilder(my_string); // StringBuilder를 사용하여 문자열을 수정 가능하게 만듦
        // stringBuilder는 초기에 객체를 한번만 생성하고 append, insert, delete, replace 등의 메서드를 사용하여 문자열을 수정할 수 있어 효율적
        for (int[] query : queries){
            int s = query[0];
            int e = query[1];
            StringBuilder temp = new StringBuilder(sb.substring(s,e+1)); // substring을 이용해 뒤집을 부분 추출
            temp.reverse();
            sb.replace(s,e+1,temp.toString()); // replace를 이용해 뒤집은 부분을 원래 문자열에 삽입
        }
        String answer = sb.toString(); // 최종적으로 수정된 문자열을 반환
        return answer;
    }

    public static void main(String[] args) {
        StringReverse sr = new StringReverse();
        System.out.println(sr.solution("rermgorpsam", new int[][]{{0, 1}, {2, 3}, {4, 5}, {6, 7}, {8, 9}, {10, 11}}));
    }
}
