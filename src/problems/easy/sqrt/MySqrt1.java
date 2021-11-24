package problems.easy.sqrt;

//Time Limit Exceeded
public class MySqrt1 implements MySqrt {
    @Override
    public int mySqrt(int x) {
        if (x == 0 || x == 1) return x;

        for (int i = x / 2; i > 0; i--) {
//          if (i * i<= x) {  i * iが大きすぎてダメ
            if (i <= x / i) {
                return i;
            }
        }
        return 0;
    }
}