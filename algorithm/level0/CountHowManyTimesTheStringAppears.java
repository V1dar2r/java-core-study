package algorithm.level0;

public class CountHowManyTimesTheStringAppears {
    public int solution(String myString, String pat) {
        int answer = 0;
        for (int i = 0;i<=myString.length()-pat.length();i++){
            if (pat.equals(myString.substring(i,i+pat.length()))){ // 방식을 바꿈
                answer++;
            }
        }
        
        return answer;
    }
    public static void main(String[] args) {
        CountHowManyTimesTheStringAppears c = new CountHowManyTimesTheStringAppears();
        System.out.println(c.solution("ababcwqeqdasabawrbaerbabqweqwfsd", "ab"));
    }
}
