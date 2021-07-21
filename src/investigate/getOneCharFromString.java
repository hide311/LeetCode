package investigate;

public class getOneCharFromString {
    private static final String STR = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final int COUNT = 1000000;

    public static void main(String[] args) {
        getWithCharAt(STR);
        getWithSubstring(STR);
    }

    private static void getWithCharAt(String str) {
        String ret = "";

        long startTime = System.nanoTime();
        for (int i = 0; i < COUNT; i++) {
            ret = String.valueOf(STR.charAt(0));
        }
        long endTime = System.nanoTime();

        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(methodName + " : " + (endTime - startTime) + "ns has passed");
    }

    private static void getWithSubstring(String str) {
        String ret = "";

        long startTime = System.nanoTime();
        for (int i = 0; i < COUNT; i++) {
            ret = STR.substring(0, 1);
        }
        long endTime = System.nanoTime();

        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(methodName + " : " + (endTime - startTime) + "ns has passed");
    }
}