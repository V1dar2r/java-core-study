package algorithm.level1;

import java.util.ArrayList;
import java.util.Collections;

public class CustomStringSort {
    public String[] solution(String[] strings, int n) {
        // Arrays.sort(strings,(a,b)->{
        //     if (a.charAt(n) == b.charAt(n)){
        //         return a.compareTo(b);
        //     }
        //     return Character.compare(a.charAt(n),b.charAt(n));
        // });
        // return strings;
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0;i<strings.length;i++){
            list.add(""+strings[i].charAt(n)+strings[i]);
        }
        Collections.sort(list);
        String[] answer = new String[list.size()];
        for (int i = 0;i<list.size();i++){
            answer[i] = list.get(i).substring(1,list.get(i).length());
        }
        return answer;
    }
    public static void main(String[] args) {
        CustomStringSort css = new CustomStringSort();
        String[] strings = {"sun","bed","car"};
        int n = 1;
        String[] answer = css.solution(strings,n);
        for (int i = 0;i<answer.length;i++){
            System.out.println(answer[i]);
        }
    }
}
