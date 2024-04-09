package bitmanipulation;

public class sitithbit {
    public static int set(int n, int i) {
        int bit = 1 << i;
        return n | bit;

    }

    public static void main(String[] args) {
        System.out.println(set(10, 2));
    }
}
