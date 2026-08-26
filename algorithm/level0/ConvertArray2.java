package algorithm.level0;

import java.util.Arrays;

public class ConvertArray2 {
    public int solution(int[] arr) {
        int x = 0;
        while (true){
            int[] past = Arrays.copyOf(arr,arr.length);
            for (int i = 0;i<arr.length;i++){
                if (arr[i] >= 50 && arr[i] % 2 == 0){
                    arr[i] /= 2;
                }
                else if (arr[i] <= 50 && arr[i] % 2 != 0){
                    arr[i] =arr[i]*2+1;
                }
            }
            if (Arrays.equals(arr,past)){
                return x;
            }
            x++;
            // past = arr; 이렇게 하면 arr랑 past가 같은 주소를 공유함
            
        }
        
    }
    public static void main(String[] args) {
        ConvertArray2 ca = new ConvertArray2();
        System.out.println(ca.solution(new int[]{1, 2, 3, 100, 99, 98}));
    }
}
