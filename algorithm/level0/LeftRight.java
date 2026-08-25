package algorithm.level0;

import java.util.ArrayList;
import java.util.List;

public class LeftRight {
    public String[] solution(String[] str_list) {
        List<String> list = new ArrayList<>();
        int d = -1;
        boolean flag = true;
        for (int i=0;i<str_list.length;i++){
            if (str_list[i].equals("l")){
               d = i; 
               flag = true;
               break;
            }
            else if (str_list[i].equals("r")){
                d = i;
                flag = false;
                break;
            }
        }
        if (d == -1){
            return new String[]{};
        }
        else if (flag){
            for (int i = 0;i<d;i++){
                list.add(str_list[i]);
            }
        }
        else if (!flag){
            for (int i = d+1;i<str_list.length;i++){
                list.add(str_list[i]);
            }
        }
        // String[] answer = new String[list.size()];
        // for (int i = 0;i<list.size();i++){
        //     answer[i] = list.get(i);
        // }
        String[] answer = list.toArray(new String[0]);
        return answer;
    }
    public static void main(String[] args) {
        LeftRight lr = new LeftRight();
        String[] result = lr.solution(new String[]{"d", "u", "u", "d", "l", "r"});
        for (String str : result) {
            System.out.print(str + " ");
        }
    }
}
