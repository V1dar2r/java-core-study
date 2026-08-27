package algorithm.level0;

public class SeparatingWithBlank {
    public String[] solution(String my_string) {
        String[] answer = my_string.split(" "); // split은 특정 문자열로 나누는 함수
        return answer;
    }
    public static void main(String[] args) {
        SeparatingWithBlank s = new SeparatingWithBlank();
        String[] result = s.solution("kc ck ckcde dsac");
        for (String str : result) {
            System.out.println(str);
        }
    }

}