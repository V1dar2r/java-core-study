package algorithm.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cutlist {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        if (n == 1){
            return Arrays.copyOfRange(num_list,0,slicer[1]+1);
        }
        else if (n == 2){
            return Arrays.copyOfRange(num_list,slicer[0],num_list.length);
        }
        else if (n == 3){
            return Arrays.copyOfRange(num_list,slicer[0],slicer[1]+1);
        }
        List<Integer> list = new ArrayList<>();
        for (int i = slicer[0];i<=slicer[1];i+=slicer[2]){
            list.add(num_list[i]);
        }
        int[] answer = new int[list.size()];
        for (int i = 0;i<list.size();i++){
            answer[i] = list.get(i); // list에서 값을 가져올때는 get()
        }
        
        return answer;
    }
    public static void main(String[] args) {
        Cutlist cl = new Cutlist();
        int[] result = cl.solution(4, new int[]{1, 7, 3}, new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8});
        System.out.println(Arrays.toString(result));
    }
    
}
