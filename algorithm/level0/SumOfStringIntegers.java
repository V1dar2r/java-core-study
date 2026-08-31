package algorithm.level0;

public class SumOfStringIntegers {
    public int solution(String num_str) {
        int answer = 0;
        for (int i=0;i<num_str.length();i++){
            answer+= num_str.charAt(i)-'0'; //이것도
        }
        return answer;
    }
    public static void main(String[] args) {
        SumOfStringIntegers sosi = new SumOfStringIntegers();
        String num_str = "123456789";
        System.out.println(sosi.solution(num_str));
    }
}
