package algorithm.level0;

// 삼항 연산자로 표현하는 방식을 사용하여 곱의 합과 합의 제곱을 비교하는 문제
// 기존에는 곱의 합과 합의 제곱을 각각 구한 후 비교했지만, 삼항 연산자를 활용하여 한 줄로 표현 가능
public class MulandAdd {
    public int solution(int[] num_list) {
        int mulSum = 1;
        int powSum = 0;
        for (int i = 0; i < num_list.length; i++) {
            mulSum *= num_list[i];
            powSum += num_list[i];
        }
        return mulSum > powSum * powSum ?  0 : 1; // 삼항 연산자 활용
    }

    public static void main(String[] args) {
        MulandAdd ma = new MulandAdd();
        System.out.println(ma.solution(new int[]{2, 3, 4}));
    }
}
