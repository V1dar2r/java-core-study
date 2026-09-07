package algorithm.level1;

import java.util.stream.IntStream;

public class innerProduct {
    public int solution(int[] a, int[] b) {
        // int answer = 0;
        // for (int i = 0;i<a.length;i++){
        //     answer+=a[i]*b[i];
        // }
        // return answer;
        return IntStream.range(0,a.length).map(s->a[s]*b[s]).sum();
    }
    public static void main(String[] args) {
        innerProduct innerProduct = new innerProduct();
        System.out.println(innerProduct.solution(new int[]{1,2,3,4},new int[]{-3,-1,0,2}));
        System.out.println(innerProduct.solution(new int[]{-1,0,1},new int[]{1,0,-1}));
    }
    
}
