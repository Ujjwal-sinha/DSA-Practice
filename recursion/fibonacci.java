package recursion;

public class fibonacci {

    public static int fibonum(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonum(n - 1) + fibonum(n - 2);
    }

    public static void main(String[] args) {
        int n = 40;
        System.out.println(fibonum(n));
    }
}
