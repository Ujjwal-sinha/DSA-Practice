package Arrays;

import java.util.*;

public class maxsumarray {
    public static void kadane(int num[]) {

        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for (int i = 0; i < num.length; i++) {
            cs = cs + num[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(ms, cs);
        }
        System.out.println("the maximum sub array sum is " + ms + " ");
    }

    public static void main(String[] args) {
        int num[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        kadane(num);
    }
}
