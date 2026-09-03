package algorithm.level1;

public class LookingforKimInSeoul {
    public String solution(String[] seoul) {
        for (int i = 0;i<seoul.length;i++){
            String s = seoul[i];
            if (s.equals("Kim")){
                return "김서방은 "+i+"에 있다";
            }
        }
        return "";
    }
    public static void main(String[] args) {
        LookingforKimInSeoul l = new LookingforKimInSeoul();
        String result = l.solution(new String[]{"Jane", "Kim"});
        System.out.println(result);
    }
}
