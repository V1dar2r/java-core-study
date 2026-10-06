package algorithm.level1;
import java.util.ArrayList;
public class MockExam {
    public int[] solution(int[] answers) {
        // int[] p1 = {1,2,3,4,5};
        // int[] p2 = {2,1,2,3,2,4,2,5};
        // int[] p3 = {3,3,1,1,2,2,4,4,5,5}; // 인덱스 나머지를 이용한 방법
        // int[] d = new int[4];
        // for (int i = 0;i<answers.length;i++){
        //     if (answers[i] == p1[i%p1.length]) d[1]++;
        //     if (answers[i] == p2[i%p2.length]) d[2]++;
        //     if (answers[i] == p3[i%p3.length]) d[3]++;
        // }
        // int maxnum = Math.max(d[3],Math.max(d[1],d[2]));
        // ArrayList<Integer> list = new ArrayList<>();
        // for (int i = 1;i<d.length;i++){
        //     if (maxnum == d[i]){
        //         list.add(i);
        //     }
        // }
        // return list.stream().mapToInt(Integer::intValue).toArray();
        int p1 = 1;
        int p2;
        int p2_n = 1;
        int p3 = 3;
        int p3_n = 0;
        int[] d = new int[3];
        for (int i = 0;i<answers.length;i++){
            int temp = answers[i];
            if (i%2 == 0){
                p2 = 2;
            }
            else{
                p2 = p2_n;
            }
            if (temp == p1) d[0]++;
            if (temp == p2) d[1]++;
            if (temp == p3) d[2]++;
            
            if (p1 == 5){
                p1 = 1;
            }
            else{
                p1++;
            }
            
            if (i%2 != 0){
                p2_n++;
                if (p2_n == 2) p2_n = 3;
                if (p2_n == 6) p2_n = 1;
            }
            p3_n++;
            if (p3_n == 2){
                p3_n = 0;
                if (p3 == 3) p3 = 1;
                else if (p3 == 1) p3 = 2;
                else if (p3 == 2) p3 = 4;
                else if (p3 == 4) p3 = 5;
                else if (p3 == 5) p3 = 3;
            }
        }
        int max = Math.max(d[0], Math.max(d[2], d[1]));
        
        ArrayList<Integer> list = new ArrayList<>();
        if (d[0] == max) list.add(1);
        if (d[1] == max) list.add(2);
        if (d[2] == max) list.add(3);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args){
        MockExam m = new MockExam();
        int[] answers = {1,2,3,4,5};
        int[] result = m.solution(answers);
        for (int i : result){
            System.out.println(i);
        }
    }
}
