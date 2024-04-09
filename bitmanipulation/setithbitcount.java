package bitmanipulation;

public class setithbitcount {
    public static int countthebit(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) { // checking lsb
                count++;
            }
            n = n >> 1;
        }
        return count;

    }

    public static void main(String[] args) {
        System.out.println(countthebit(10));

    }
}
