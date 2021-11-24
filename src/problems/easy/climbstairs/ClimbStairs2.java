package problems.easy.climbstairs;

import java.util.ArrayList;
import java.util.List;

//0ms
public class ClimbStairs2 implements ClimbStairs {
    @Override
    public int climbStairs(int n) {
        List<Integer> stairList = new ArrayList();
        for (int i = 1; i <= n; i++) {
            if (i <= 2) {
                stairList.add(i);
            } else {
                stairList.add(stairList.get(i - 3) + stairList.get(i - 2));
            }
        }
        return stairList.get(stairList.size() - 1);
    }
}