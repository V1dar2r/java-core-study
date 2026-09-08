package algorithm.level1;

public class Watermelon {
    public String solution(int n) {
        String answer = "";
        for (int i=0;i<n/2;i++){
            answer+="수박";
        }
        if (n%2!=0){
            answer+="수";
        }
        return answer;
    }
    public static void main(String[] args) {
        Watermelon wm = new Watermelon();
        System.out.println(wm.solution(3));
        System.out.println(wm.solution(4));
    }
}