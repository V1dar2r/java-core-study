package core;


public class exceptionEx {
    static class ErrException extends Exception{ // 사용자 정의 예외 클래스
        private String message;
        public ErrException(String message){
            super(message);
            this.message = message;
        }
        public void printMessage(){
            System.out.println(this.message);
        }
        public String getMessage(){
            return this.message;
        }
    }
    public static void main(String[] args) {
        String str = null;
        try{
            System.out.println(str.length()); // NullPointerException 발생
            throw new ErrException("에러 발생");

        }catch (NullPointerException e){
            System.out.println("NullPointerException 발생");
        }
        catch(ErrException e){ // 사용자 정의 예외 처리
            e.printMessage();
            e.getMessage();
            e.printStackTrace();
        }
        catch(Exception e){ // 자세한 오류를 알지 못하지만 예외가 발생했을 때 처리
            System.out.println("Exception 발생");
            e.printStackTrace(); // 예외 발생 시점의 스택 트레이스 출력
            System.out.println(e.getMessage()); // 예외 발생 시점의 메시지 출력
        }
        finally{ // 예외 발생 여부와 상관없이 항상 실행
            System.out.println("예외 발생 여부와 상관없이 항상 실행");
        }
    }
    
}
