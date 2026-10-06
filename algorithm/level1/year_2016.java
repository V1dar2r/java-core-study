package algorithm.level1;

public class year_2016 {
    public String solution(int a, int b) {
        String[] answer = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int cnt = 0;
        for (int i =1;i<a;i++){
            if (i<=7){
                if (i == 2){
                    cnt+=29;
                }
                else if (i%2 == 1){
                    cnt+=31;
                }
                else{
                    cnt+=30;
                }
            }
            if (i>7){
                if (i%2 == 0){
                    cnt+=31;
                }
                else{
                    cnt+=30;
                }
            }            
        }
        cnt+=b-1; // 날짜는 base-1 인덱스부터 시작하지만  요일은 0-base부터 시작하기때문에 1을 빼게됨
        
        return answer[cnt%7];
    }
    public static void main(String[] args){
        year_2016 y = new year_2016();
        System.out.println(y.solution(5,24));
    }
}