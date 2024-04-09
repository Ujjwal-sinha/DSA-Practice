package bitmanipulation;

public class clearlastithbit {
    public static int last(int n, int i) {
        int bit = (~0) << i;
        return n & bit;
    }

    public static void main(String[] args) {
        System.out.println(last(15, 2));
    }
}
