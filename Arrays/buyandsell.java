
package Arrays;

import java.util.*;

public class buyandsell {
    public static int bspm(int prices[]) {
        int buy = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (buy < prices[i]) {
                int profit = prices[i] - buy;
                maxprofit = Math.max(maxprofit, profit);
            } else {
                buy = prices[i];
            }
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(bspm(prices));
    }
}
