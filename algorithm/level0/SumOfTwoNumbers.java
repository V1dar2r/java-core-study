package algorithm.level0;

public class SumOfTwoNumbers {
    public String solution(String a, String b) {
        StringBuilder sb = new StringBuilder(); // 접근
        int c = 0;
        int i = a.length()-1;
        int j = b.length()-1;
        while (i >= 0 || j >= 0){
            int s;
            if (i < 0){
                s = b.charAt(j) - '0' + c;
                j--;
            }
            else if (j < 0){
                s = a.charAt(i) - '0' + c;
                i--;
            }
            else{
                s = a.charAt(i) - '0' + b.charAt(j) - '0' + c;
                i--;
                j--;
            }
            c = s/10;
            sb.append(""+s%10);
        }
        if (c==1){
            sb.append(""+c);
        }
        sb.reverse();
        
        return sb.toString();
    }
    public static void main(String[] args) {
        SumOfTwoNumbers sotn = new SumOfTwoNumbers();
        String a = "123456789";
        String b = "987654321";
        System.out.println(sotn.solution(a,b));
    }
}
