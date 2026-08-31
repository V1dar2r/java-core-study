package algorithm.level0;

import java.util.Arrays;

public class FromBehindToFifthPlace {
    public int[] solution(int[] num_list) {
        // Arrays.sort(num_list);
        // return Arrays.stream(num_list).filter(s -> s >= num_list[5]).toArray(); // 정렬 전 배열 사용 실수 -> 중복 값이 있으면 사용 불가
        return Arrays.stream(num_list).sorted().skip(5).toArray();
    }
    public static void main(String[] args) {
        FromBehindToFifthPlace fbtfp = new FromBehindToFifthPlace();
        int[] num_list = {12, 4, 15, 46, 38, 1, 14};
        System.out.println(Arrays.toString(fbtfp.solution(num_list)));
    }
}
