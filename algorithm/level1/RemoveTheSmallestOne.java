package algorithm.level1;
import java.util.ArrayList;
import java.util.List;

public class RemoveTheSmallestOne {
    public int[] solution(int[] arr) {
        if (arr.length == 1) return new int[]{-1};
        int minNum = 2100000000;
        List<Integer> list = new ArrayList<>();
        for (int n:arr){
            minNum = Math.min(minNum,n);
            list.add(n);
        }
        list.remove(list.indexOf(minNum));
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        RemoveTheSmallestOne removeTheSmallestOne = new RemoveTheSmallestOne();
        int[] arr = {2,1,21,5,6,2,312,14,15,21,12,1,2,3,4,5,6,7,8,9,10};
        int[] result = removeTheSmallestOne.solution(arr);
        for (int n:result){
            System.out.print(n + " ");
        }
    }
}
