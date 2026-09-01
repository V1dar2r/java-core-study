package algorithm.level0;

public class SpecialTwoDimensionalArray1 {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n]; 
        for (int i = 0;i<n;i++){
            answer[i][i]=1;
        }
        return answer;
    }
    public static void main(String[] args){
        SpecialTwoDimensionalArray1 st = new SpecialTwoDimensionalArray1();
        System.out.println(st.solution(5));
    }
}
    
