package core;

public class multiThread extends Thread {
    public static void main(String[] args){
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(); // 멀티 스레드에서 동기화를 보장
        java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder(); // 멀티 스레드에서 동기화를 보장하지 않음

        new Thread(() ->{
            for (int i=0;i<10000;i++){
                stringBuffer.append(1);
                stringBuilder.append(1);
            }
        }).start();

        new Thread(() ->{
            for (int i=0;i<10000;i++){
                stringBuffer.append(1);
                stringBuilder.append(1);
            }
        }).start();
        new Thread(() ->{
            try {
                Thread.sleep(2000);

                System.out.println("StringBuffer length: " + stringBuffer.length());
                System.out.println("StringBuilder length: " + stringBuilder.length());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
    
}
