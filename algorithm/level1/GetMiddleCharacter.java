package algorithm.level1;

public class GetMiddleCharacter {
    public String solution(String s) {
        int l = s.length();
        if (l % 2 == 0){
            return s.substring(l/2-1,l/2+1); //반올림
        }
        return s.substring(l/2,l/2+1); // 끝은포함안함
        
    }
    public static void main(String[] args) {
        GetMiddleCharacter gmc = new GetMiddleCharacter();
        System.out.println(gmc.solution("abcde"));
        System.out.println(gmc.solution("qwer"));
    }
}