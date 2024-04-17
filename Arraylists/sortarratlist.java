package Arraylists;

import java.util.*;

public class sortarratlist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(28);
        list.add(3);
        list.add(42);
        list.add(15);
        System.out.println(list);
        Collections.sort(list);
        System.out.print(list);
    }
}
