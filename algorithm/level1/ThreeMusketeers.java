package algorithm.level1;


public class ThreeMusketeers{
    public static void main(String[] args) {
        ThreeMusketeers tm = new ThreeMusketeers();
        int[] number = {-2, 0, 0, 2, 3};
        System.out.println(tm.solution(number));
    }
    public int solution(int[] number) {
        int answer = 0;
        for (int i = 0;i<number.length-2;i++){
            for (int j = i+1;j<number.length-1;j++){
                for (int k = j+1;k<number.length;k++){
                    if (number[k]+number[i]+number[j] == 0){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}