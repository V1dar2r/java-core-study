package algorithm.level0;

public class FindTheDesiredString {
    public int solution(String myString, String pat) {
        // pat = pat.toLowerCase();
        // myString = myString.toLowerCase();
        // int i = 0;
        // if (pat.length() > myString.length()) return 0;
        // for (char s: myString.toCharArray()){
        //     if (i == pat.length()){
        //         return 1;
        //     }
        //     if (s == pat.charAt(i)){
        //         i++;
        //     }
        //     else {
        //         i = 0;
        //         if (pat.charAt(i) == s){ // 예외 처리
        //             i++;
        //         }
        //     }
        // }
        // if (pat.length() == i){ // 예외 처리
        //     return 1;
        // }
        // return 0;
        return (myString.toUpperCase().contains(pat.toUpperCase())) ? 1:0;
    }
    public static void main(String[] args) {
        FindTheDesiredString fds = new FindTheDesiredString();
        System.out.println(fds.solution("vadsdf", "sdf"));
    }
}

