package algorithm.level0;

import java.util.Arrays;

public class FromTheBackToFifthPlace {
        public int[] solution(int[] num_list) {
        return Arrays.stream(num_list).sorted().limit(5).toArray(); //
    }
    public static void main(String[] args) {
        FromTheBackToFifthPlace fromTheBackToFifthPlace = new FromTheBackToFifthPlace();
        int[] num_list = {12, 4, 15, 46, 38, 1, 14};
        int[] result = fromTheBackToFifthPlace.solution(num_list);
        System.out.println(Arrays.toString(result));
    }
}
