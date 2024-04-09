package bitmanipulation;

public class clearith {
    public static int clear(int n, int i) {
        int bit = ~(1 << i);
        return n & bit;

    }

    public static void main(String[] args) {
        System.out.println(clear(10, 1));
    }
}
