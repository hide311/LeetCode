package problems.sqrt;

public class MySqrt2 implements MySqrt {
    @Override
    public int mySqrt(int x) {
        if (x == 0 || x == 1) return x;

        int head = 0, tail = x;
        while (head < tail) {
            int mid = (head + tail) / 2;

            //midが0のとき、この後エラーになるので、ここで返しておく。
            if (mid == 0) return 0;
            if (mid > x / mid) {
                tail = mid - 1;
            } else {
                head = mid + 1;
                if (head > x / head) {
                    return mid;
                }
            }
        }
        return head;
    }
}