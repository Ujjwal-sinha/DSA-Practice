package Arraylists;

import java.util.ArrayList;

public class pairsum1 {
    public static boolean pairr(ArrayList<Integer> list, int target) {

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == target) {
                    return true;
                }
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
        System.out.println(pairr(list, target));
    }
}
