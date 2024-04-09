package bitmanipulation;

public class gitithbit {
    public static int getbitpos(int n, int i) {
        int bit = 1 << i;// left shift
        if ((n & bit) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(getbitpos(4, 2));
    }

}
