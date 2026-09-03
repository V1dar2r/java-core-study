package algorithm.level1;
import java.util.Arrays;
public class ArrayOfNumbersThatAreDividedAndSeparated {
        public int[] solution(int[] arr, int divisor) {
//         List<Integer> list = new ArrayList<>();
//         for (int n : arr){
//             if (n%divisor == 0){
//                 list.add(n);
//             }
//         }
        
//         return list.size() == 0 ? new int[]{-1} : list.stream().mapToInt(Integer::intValue).sorted().toArray();
        int[] answer = Arrays.stream(arr).filter(s->s%divisor == 0).sorted().toArray();
        if (answer.length == 0) return new int[]{-1};
        return answer;
    }
    public static void main(String[] args) {
        ArrayOfNumbersThatAreDividedAndSeparated a = new ArrayOfNumbersThatAreDividedAndSeparated();
        int[] result = a.solution(new int[]{5, 9, 7, 10}, 5);
        System.out.println(Arrays.toString(result));
    }
}
