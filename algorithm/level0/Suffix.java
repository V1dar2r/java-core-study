package algorithm.level0;

import java.util.ArrayList;
import java.util.List;

public class Suffix {
    public List<String> solution(String my_string) {
        List<String> list = new ArrayList<>();
        for (int i =0;i<my_string.length();i++){
            StringBuilder temp = new StringBuilder();
            for (int j = i;j<my_string.length();j++){
                char c = my_string.charAt(j);
                temp.append(c);
            }
            list.add(temp.toString());
        }
        list.sort(null); // list를 오름차순으로 정렬 시 null을 인자로 전달하면 기본 정렬 기준으로 정렬됨
        return list;
    }
    public static void main(String[] args) {
        Suffix s = new Suffix();
        System.out.println(s.solution("banana"));
    }
}
