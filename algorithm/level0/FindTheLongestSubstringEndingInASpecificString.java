package algorithm.level0;

public class FindTheLongestSubstringEndingInASpecificString {
    public String solution(String myString, String pat) {
        // StringBuilder sb = new StringBuilder(myString);
        // int e = 0;
        // int l = pat.length()-1;
        // for (int i = myString.length()-1;i>=0;i--){
        //     if (myString.charAt(i) == pat.charAt(l)){
        //         l--;
        //         if (l == -1){
        //             e = i;
        //             break;
        //         }
        //     }
        //     else {
        //         l = pat.length()-1;
        //         if (myString.charAt(i) == pat.charAt(l)){
        //             l--;
        //         }
        //     }
        // }
        // return sb.substring(0,e+pat.length()).toString();
        int e = myString.lastIndexOf(pat); 
        return myString.substring(0,e+pat.length()).toString();
    }
    public static void main(String[] args) {
        FindTheLongestSubstringEndingInASpecificString f = new FindTheLongestSubstringEndingInASpecificString();
        System.out.println(f.solution("ababcwqeqdasabawrbaerbabqweqwfsd", "ab"));
    }
}