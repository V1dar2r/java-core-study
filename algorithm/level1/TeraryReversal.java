package algorithm.level1;

public class TeraryReversal {
    public int solution(int n) {
        // int num = n;
        // int answer = 0;
        // StringBuilder sb = new StringBuilder();
        // while (num > 0){
        //     sb.append(num%3);
        //     num = num / 3;
        // }
        // for (int i = sb.length()-1;i>=0;i--){
        //     answer+=(sb.charAt(i)-'0')*Math.pow(3,sb.length()-1-i);
        // }
        // return answer;
        StringBuilder sb = new StringBuilder();
        while (n > 0){
            sb.append(n%3);
            n /= 3;
        }
        String a = sb.toString();
        return Integer.parseInt(a,3);
        
    }
    public static void main(String[] args) {
        TeraryReversal tr = new TeraryReversal();
        System.out.println(tr.solution(45));
    }
}
