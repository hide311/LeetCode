package investigate;

public class MayTimesNew {
    static final int COUNT = 100000;
    public static void main(String[] args) {
        manyNewWithDecration();
        manyNewWithoutDecration();
    }

    private static void manyNewWithDecration(){
        long beforeUsedMemory=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
        long statTime = System.nanoTime();
        for (int i = 0; i < COUNT; i++){
            int num = i;
        }
        long endTime = System.nanoTime();
        long afterUsedMemory=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
        long usingMemory = afterUsedMemory - beforeUsedMemory;
        System.out.println(endTime-statTime + " nano sec has passed." + usingMemory + " is used" );

    }

    private static void manyNewWithoutDecration(){
        long beforeUsedMemory=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
        long statTime = System.nanoTime();
        int num;
        for (int i = 0; i < COUNT; i++){
            num = i;
        }
        long endTime = System.nanoTime();
        long afterUsedMemory=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
        long usingMemory = afterUsedMemory - beforeUsedMemory;
        System.out.println(endTime-statTime + " nano sec has passed." + usingMemory + " is used" );
    }
}
