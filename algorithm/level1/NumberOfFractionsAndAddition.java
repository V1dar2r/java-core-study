package algorithm.level1;

public class NumberOfFractionsAndAddition {
    public int solution(int left, int right) {
//         int answer = 0;
//         for (int i=left;i<=right;i++){
//             int cnt = 0;
//             for (int j=1;j<=i;j++){
//                 if (i%j==0){
//                     cnt++;
//                 }
//             }
//             if (cnt%2==0){
//                 answer+=i;
//             }
//             else{
//                 answer-=i;
//             }
            
//         }
//         return answer;
        int answer = 0;
        for (int i=left;i<=right;i++){ 
            if (i%Math.sqrt(i)==0){ // 해당 수가 제곱수인지 확인 -> 제곱수는 약수의 개수가 홀수개  
                answer-=i;
            }
            else{
                answer+=i;
            }
        }
        return answer;
    }
    public static void main(String[] args){
        NumberOfFractionsAndAddition nfa = new NumberOfFractionsAndAddition();
        System.out.println(nfa.solution(13,23));
    }
}
