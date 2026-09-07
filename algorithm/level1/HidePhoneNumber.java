package algorithm.level1;

public class HidePhoneNumber {
    public String solution(String phone_number) {
        String answer = "";
        for (int i = 0;i<phone_number.length()-4;i++){
            answer+="*";
        }
        answer+=phone_number.substring(phone_number.length()-4);
        return answer;
    }
    public static void main(String[] args) {
        HidePhoneNumber hidePhoneNumber = new HidePhoneNumber();
        System.out.println(hidePhoneNumber.solution("01033334444"));
        System.out.println(hidePhoneNumber.solution("027778888"));
    }
}
