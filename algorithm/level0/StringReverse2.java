package algorithm.level0;

public class StringReverse2 {
    public String solution(String my_string, int s, int e) {
        StringBuilder ans = new StringBuilder(my_string); // stringbuilder나 stringbuffer를 이용해서 문자열 메서드 사용 가능
        StringBuilder sb = new StringBuilder(ans.substring(s,e+1));
        sb.reverse();
        ans.replace(s,e+1,sb.toString());
        my_string = ans.toString();
        return my_string;
    }
    public static void main(String[] args) {
        StringReverse2 sr = new StringReverse2();
        System.out.println(sr.solution("rermgorpsam", 0, 1));
    }
}

