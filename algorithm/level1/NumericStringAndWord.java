package algorithm.level1;

public class NumericStringAndWord {
    public int solution(String s) {
        // StringBuilder sb = new StringBuilder();
        // String temp = "";
        // Map<String,Integer> map = new HashMap<>();
        String[] words = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        // for (int i = 0;i<10;i++){
        //     map.put(words[i],i);
        // }
        // for (int i = 0;i<s.length();i++){
        //     if (Character.isDigit(s.charAt(i))){
        //         sb.append(s.charAt(i));
        //     }
        //     else{
        //         temp+=s.charAt(i);
        //         if (map.containsKey(temp)){
        //             sb.append(map.get(temp));
        //             temp = "";
        //         }
        //     }
        // }
        // if (temp.length() > 0){
        //     sb.append(map.get(temp));
        // }
        // String answer = sb.toString();
        // return Integer.parseInt(answer);
        for (int i = 0;i<10;i++){
            s = s.replaceAll(words[i],Integer.toString(i)); // 특정 문자열을 찾아 인덱스로 변환
        }
        return Integer.parseInt(s);
    }
    public static void main(String[] args) {
        NumericStringAndWord nsaw = new NumericStringAndWord();
        System.out.println(nsaw.solution("one4seveneight"));
    }
}
