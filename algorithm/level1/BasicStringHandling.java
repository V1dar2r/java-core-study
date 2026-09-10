package algorithm.level1;

public class BasicStringHandling{
    public boolean solution(String s) {
        if (s.length() == 4 || s.length() == 6){
            for (char ss:s.toCharArray()){
                if (Character.isLetter(ss)){
                    return false;
                }
            }
            return true;

        }
        return false;
    }
    public static void main(String[] args) {
        BasicStringHandling b = new BasicStringHandling();
        boolean result = b.solution("a234");
        System.out.println(result);
    }

}