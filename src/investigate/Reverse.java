package investigate;

public class Reverse {

    public static void main(String[] args) {
        reverseWithStringBuffer();
        reverseWithStringBuilder();
    }

    private static long prepareTestData(){
        return Long.MAX_VALUE;
    }

    private static void reverseWithStringBuffer(){
        long x = prepareTestData();
        long startTime = System.nanoTime();

        StringBuffer sb = new StringBuffer();
        while(x>0){
            sb.append(x%10);
            x /= 10;
        }
        String a = sb.toString();
        long endTime = System.nanoTime();

        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        System.out.println(methodName + " : " + (endTime-startTime) + "ns has passed");
    }

    private static void reverseWithStringBuilder(){
        long x = prepareTestData();
        long startTime = System.nanoTime();

        StringBuilder sb = new StringBuilder(Long.toString(x)).reverse();
        String a = sb.toString();

        long endTime = System.nanoTime();
        String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        System.out.println(methodName + " : " + (endTime-startTime) + "ns has passed");
    }
}
