package algorithm.level1;

public class CaesarCipher {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            int a = 0;
            if (ch == ' '){
                sb.append(ch);
                continue;
            }
            if (Character.isUpperCase(ch)){
                // if (ch+n > 'Z'){
                //     a = (ch+n) - 'Z' + 'A'-1;
                //     System.out.println((ch+n) - 'Z');
                    
                // }
                // else{
                //     a = ch+n;
                // }
                a = (ch+n - 'A') % 26+'A';
            }
            else{
                // if (ch+n > 'z'){
                //     a =  (ch+n) - 'z' + 'a'-1;
                //     System.out.println((ch+n) - 'z');
                    
                // }
                // else{
                //     a = ch+n;
                // }  
                a = (ch+n - 'a') % 26+'a';              
            }
            sb.append((char)a);
        }
        return sb.toString();
    }
}
