package Arraylists;

import java.util.ArrayList;

public class pairsumtwopointer {
    public static boolean pair(ArrayList<Integer> list, int target) {

        int lp = 0;
        int rp = list.size() - 1;
        while (lp < rp) {
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            } else if (list.get(lp) + list.get(rp) < target) {
                lp++;
            } else {
                rp--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(28);
        list.add(3);
        list.add(42);
        list.add(15);
        int target = 25;
        System.out.println(pair(list, target));
    }
}
