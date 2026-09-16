package algorithm.level1;

public class WeirdString{
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        for (int i = 0;i<s.length();i++){
            if (s.charAt(i) == ' '){
                cnt = 0;
                sb.append(" ");
                continue;
            }
            if (cnt%2==0){
                sb.append(Character.toUpperCase(s.charAt(i)));
                
            }
            else{
                sb.append(Character.toLowerCase(s.charAt(i)));
                
            }
            cnt++;
            
            
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        WeirdString ws = new WeirdString();
        String s = "try hello world";
        System.out.println(ws.solution(s));
    }
}