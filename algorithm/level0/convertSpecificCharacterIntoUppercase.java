package algorithm.level0;

public class convertSpecificCharacterIntoUppercase {
    public String solution(String my_string, String alp) {
        StringBuilder sb = new StringBuilder();
        for (char s : my_string.toCharArray()){
            if (s == alp.charAt(0)){
                sb.append(alp.toUpperCase());
            }
            else{
                sb.append(s);
            }
        }
        String answer = sb.toString();
        return answer;
    }
    public static void main(String[] args) {
        convertSpecificCharacterIntoUppercase csciu = new convertSpecificCharacterIntoUppercase();
        System.out.println(csciu.solution("sdafirfonvoads", "f"));
    }
}