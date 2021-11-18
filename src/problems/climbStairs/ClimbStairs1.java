package problems.climbStairs;

import java.util.ArrayList;
import java.util.List;

//0ms
public class ClimbStairs1 implements ClimbStairs {
    @Override
    public int climbStairs(int n) {
        List<Integer> stairList = new ArrayList();
        for (int i = 1; i <= n; i++) {
            switch (i) {
                case 1:
                    stairList.add(1);
                    break;
                case 2:
                    stairList.add(2);
                    break;
                default:
                    stairList.add(stairList.get(i - 3) + stairList.get(i - 2));
                    break;
            }
        }
        return stairList.get(stairList.size() - 1);
    }
}