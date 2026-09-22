package algorithm.level1;

import java.util.Arrays;

public class KthNumber {
    public int[] solution(int[] array, int[][] commands) {
//         List<Integer> answer = new ArrayList<>();
//         ArrayList<Integer> list = new ArrayList<>();
//         for (int n: array){
//             list.add(n);
//         }
//         for (int[] command : commands){
//             int i = command[0];
//             int j = command[1];
//             int k = command[2];
//             List<Integer> l = new ArrayList<>(list.subList(i-1,j)); // 서브 리스트는 독립적인 새로운 리스트가 아닌 원본 리스트의 특정구간을 보여주는 것이다. 서브 리스트의 순서나 수정할 시 원본이 수정된다. 따라서 독립적인 리스트를 만들려면 새로운 리스트로 만들어야한다.
//             System.out.println(l);
            
//             l.sort(Comparator.naturalOrder());
//             answer.add(l.get(k-1));
            
//         }
//         return answer.stream().mapToInt(Integer::intValue).toArray();
        int[] answer =  new int[commands.length];
        for (int i = 0;i<commands.length;i++){
            int[] temp = Arrays.copyOfRange(array,commands[i][0]-1,commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }
        return answer;
    }
    public static void main(String[] args) {
        KthNumber kn = new KthNumber();
        int[] array = {1,5,2,6,3,7,4};
        int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
        System.out.println(Arrays.toString(kn.solution(array,commands)));
    }
}
