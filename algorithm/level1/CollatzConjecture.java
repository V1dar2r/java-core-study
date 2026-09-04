package algorithm.level1;

public class CollatzConjecture {
    public int solution(int num) {
//         int cnt = 0;
//         if (num == 1) return 0;
//         while (cnt <= 500){
//             if (num == 1){
//                 return cnt;
//             }
//             if (num % 2 == 0){
//                 num/=2;
//             }
//             else if (num%2 ==1){
//                 num*=3;
//                 num+=1;
//             }

//             cnt++;
//         }
//         return -1;
        long n = (long) num;
        if (num == 1) return 0;
        for (int i = 0;i<500;i++){
            if (n == 1) return i;
            n= (n%2==0) ? n/2 : n*3+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        CollatzConjecture collatzConjecture = new CollatzConjecture();
        int num = 6;
        int result = collatzConjecture.solution(num);
        System.out.println(result);
    }
}
