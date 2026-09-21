package algorithm.level1;

public class FoodFightContest{
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        for (int i =1;i<food.length;i++){
            for (int j = 0;j<food[i]/2;j++){
                sb.append(i);
            }
        }
        sb.append(0);
        return sb.toString()+sb.reverse().substring(1,sb.length());
    }
    public static void main(String[] args) {
        FoodFightContest foodFightContest = new FoodFightContest();
        int[] food = {1, 3, 4, 6};
        String result = foodFightContest.solution(food);
        System.out.println(result);
    }
    
}