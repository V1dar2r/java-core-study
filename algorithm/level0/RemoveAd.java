package algorithm.level0;

import java.util.ArrayList;
import java.util.List;

public class RemoveAd {
    public String[] solution(String[] strArr) {
        List<String> list = new ArrayList<>();
        for (String s : strArr){
            if (!s.contains("ad")){
                list.add(s);
            }
        }
        String[] answer = list.toArray(new String[0]); // 괄호안에 타입 명시
        return answer;
    }
    public static void main(String[] args) {
        RemoveAd r = new RemoveAd();
        String[] strArr = {"and", "not", "ad", "ads", "add", "adf"};
        String[] answer = r.solution(strArr);
        for (String s : answer){
            System.out.println(s);
        }
    }
}
