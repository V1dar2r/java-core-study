package algorithm.level1;

public class MinimumRectangle {
    public int solution(int[][] sizes) {
        int maxMaxNum = 0;
        int minMaxNum = 0;
        for (int[] arr: sizes){
            int a = arr[0];
            int b = arr[1];
            int maxNum = Math.max(a,b);
            int minNum = Math.min(a,b);
            maxMaxNum = Math.max(maxMaxNum,maxNum);
            minMaxNum = Math.max(minMaxNum,minNum);
        }
        
        return maxMaxNum*minMaxNum;
    }
    public static void main(String[] args) {
        MinimumRectangle mr = new MinimumRectangle();
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        System.out.println(mr.solution(sizes));
    }
    
}
