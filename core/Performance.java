package core;

public class Performance {
    public static void main(String[] args){
    final int lengths = 500000;

        long startTime1 = System.currentTimeMillis();

        String str = "";
        for (int i = 0; i< lengths;i++){
            str+="*";
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("String performance: " + (endTime1 - startTime1) + " ms");

        long startTime2 = System.currentTimeMillis();
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (int i = 0; i<lengths;i++){
            stringBuffer.append("*");
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println("StringBuffer performance: " + (endTime2 - startTime2) + " ms");
        
        long startTime3 = System.currentTimeMillis();
        java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder();
        for (int i = 0; i< lengths;i++){
            stringBuilder.append("*");
        }
        long endTime3 = System.currentTimeMillis();
        System.out.println("StringBuilder performance: " + (endTime3 - startTime3) + " ms");
        //String performance: 20761 ms
        //StringBuffer performance: 26 ms
        //StringBuilder performance: 11 ms
        //StringBuilder가 가장 빠른 걸 알 수 있다. 스레드 환경에서의 안정성 덜어내고 성능을 높였기 때문에 StringBuffer보다 빠른 성능을 보여준다.
    }
}
