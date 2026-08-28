package algorithm.level0;

import java.util.Arrays;

public class ThreeDelimiters {
    public String[] solution(String myStr) {
       // String[] s= myStr.split("[a,b,c]",-1);
       //  List<String> list = new ArrayList<>(Arrays.asList(s));
       //  List<String> list2 = new ArrayList<>();
       //  list2.add("");
       //  list.removeAll(list2);
       //  String[] answer = list.toArray(new String[0]);
       //  if (answer.length == 0) return new String[]{"EMPTY"};
       //  return answer;
           String[] answer = Arrays.stream(myStr.split("[a,b,c]",-1)).filter(s ->!s.isEmpty()).toArray(String[] :: new);
        return answer.length == 0 ? new String[]{"EMPTY"} : answer;
        
    }
    public static void main(String[] args) {
        ThreeDelimiters threeDelimiters = new ThreeDelimiters();
        String myStr = "abpcplea";
        String[] result = threeDelimiters.solution(myStr);
        System.out.println(Arrays.toString(result));
    }
}
