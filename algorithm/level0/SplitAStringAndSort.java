package algorithm.level0;

import java.util.Arrays;

public class SplitAStringAndSort {
    public String[] solution(String myString) {
        return Arrays.stream(myString.split("x")).filter(s -> !s.isEmpty()).sorted().toArray(String[]::new); //
        
    }
    public static void main(String[] args) {
        SplitAStringAndSort s = new SplitAStringAndSort();
        System.out.println(Arrays.toString(s.solution("axxxbxxc")));
    }
}
