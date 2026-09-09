package algorithm.level1;

import java.util.Arrays;

public class SortStringDesc {
    public String solution(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder(new String(arr));
        return sb.reverse().toString();
    }
    public static void main(String[] args){
        SortStringDesc ssd = new SortStringDesc();
        System.out.println(ssd.solution("ZbcdqweAsdsdwfefeASBVklwqOINIWQNOCefg"));
    }
}
