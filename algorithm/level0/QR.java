package algorithm.level0;

public class QR {
    public String solution(int q, int r, String code) {
        StringBuilder sb = new StringBuilder(); // stringbuilder에는 문자도 append 가능
        for (int i = 0;i<code.length();i++){
            if (i%q == r){
                sb.append(code.charAt(i));
            }
        }
        String answer = sb.toString();
        return answer;
    }
    public static void main(String[] args) {
        QR qr = new QR();
        System.out.println(qr.solution(3, 1, "qjnwezgrpirldywt"));
    }
}
