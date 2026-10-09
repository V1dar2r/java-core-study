package algorithm.level1;

public class FindPrime {
    public int solution(int n) {
        int answer = 0;
        boolean[] arr = new boolean[n+1];
        
        arr[1] = arr[0] = true;
        for  (int i = 2;i<=Math.sqrt(n);i++){
                if (!arr[i]){
                    for (int j = i*i;j<=n;j+=i){
                        arr[j] = true;
                    }
                }
            }
        for (int i = 2;i<=n;i++){
            if (!arr[i]){
                answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        FindPrime findPrime = new FindPrime();
        System.out.println(findPrime.solution(10));
    }
}
