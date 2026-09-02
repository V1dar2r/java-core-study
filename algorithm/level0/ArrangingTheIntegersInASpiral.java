package algorithm.level0;

public class ArrangingTheIntegersInASpiral {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int i = 1;
        int r = 0;
        int c = n;
        while (i <= n*n){
            for (int j = r;j<c;j++){ //4 14
                answer[r][j] = i;
                i++;
            }
            c--; //3 
            for (int j = r+1;j<=c;j++){ //7 
                answer[j][c] = i;
                i++;
            }
            for (int j = c-1;j>=r;j--){// 10
                answer[c][j] = i;
                i++;
            }
            for (int j = c-1;j>r;j--){ // 12
                answer[j][r] = i;
                i++;
            }
            r++; // 1
            
        }
        return answer;
    }
    public static void main(String[] args) {
        ArrangingTheIntegersInASpiral a = new ArrangingTheIntegersInASpiral();
        int[][] result = a.solution(4);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
