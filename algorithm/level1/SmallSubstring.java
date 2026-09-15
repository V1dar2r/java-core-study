package algorithm.level1;

public class SmallSubstring{
    public int solution(String t, String p) {
        int answer = 0;
        Long ip = Long.parseLong(p); // 자료형 범위 생각 못함 
        for (int i =0;i<=t.length()-p.length();i++){
            if (Long.parseLong(t.substring(i,i+p.length())) <= ip){
                answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        SmallSubstring s = new SmallSubstring();
        int result = s.solution("3141592", "271");
        System.out.println(result);
    }

}