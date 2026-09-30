package algorithm.level1;

public class CardDeck {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int c1 = 0;
        int c2 = 0;
        for (int i = 0;i<goal.length;i++){
            if (c1 < cards1.length && cards1[c1].equals(goal[i])){               
                c1++;
            }
            else if (c2 < cards2.length && cards2[c2].equals(goal[i])){
                c2++;
            }
            else{
                return ""+"No";
            }
        }
        return ""+"Yes";
    }
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        String[] cards1 = {"i", "drink", "water"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};
        System.out.println(cd.solution(cards1, cards2, goal));
    }
}
