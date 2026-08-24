package algorithm.level0;

public class CharErase {
    public String solution(String my_string, int[] indices) {
        StringBuilder sb = new StringBuilder();
        int[] cnt = new int[my_string.length()];
        for (int n: indices){
            cnt[n] = 1;
        }
        for (int i = 0;i<my_string.length();i++){
            if (cnt[i] != 1){
                sb.append(my_string.charAt(i));
            }
            
        }
        String answer = sb.toString();
        return answer;
    }
    public static void main(String[] args) {
        CharErase ce = new CharErase();
        System.out.println(ce.solution("iaterasdfernasadfl", new int[]{1, 5, 6, 7, 8, 9, 10, 13, 14, 15, 16}));
    }
}
