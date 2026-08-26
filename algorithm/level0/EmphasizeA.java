package algorithm.level0;

public class EmphasizeA {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();
        for (char s : myString.toCharArray()){
            if (s == 'a' || s == 'A'){ // 대문자 A 생각
                sb.append('A');
            }
            else{
                sb.append(Character.toLowerCase(s));
            }
        }
        String answer = sb.toString();
        
        return answer;
    }
    public static void main(String[] args) {
        EmphasizeA ea = new EmphasizeA();
        System.out.println(ea.solution("aleirivaavavaewra"));
    }
}

