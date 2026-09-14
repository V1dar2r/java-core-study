package algorithm.level1;

public class GcdAndLcm {
    public int[] sol(int a,int b){
        int[] answer = new int[2];
        answer[0] = gcd(a,b);
        answer[1] = a/answer[0]*b;
        return answer;
    }
    public static int gcd(int p ,int q){
        if (q == 0) return p;
        return gcd(q,p%q);
    }
    public int[] solution(int n, int m) {
//         int[] answer = new int[2];
//         int s = Math.min(n,m);
//         int b = Math.max(n,m);
//         for (int i = s;i>=1;i--){
//             if (s%i==0 && b%i == 0){ // 작은수부터 1까지 두 수가 모두 나누어떨어지는 경우 최대 공약수
//                 answer[0] = i;
//                 break;
//             }
//         }
//         // for (int i = 1;i<=b;i++){ // 작은 수에 1부터 곱한 값이 큰 수에 나누어 떨어지는 경우 최소 공배수
//         //     if (s*i%b == 0){
//         //         answer[1] = s*i;
//         //         break;
//         //     }
//     // }
//         int i = 1;
//         while (true){
//             if ((s*i)%b == 0){
//                 answer[1] = s*i;
//                 break;
//             }
//             i++;
//         }
        
    
        
//         return answer;
        return sol(n,m);
    }
}
