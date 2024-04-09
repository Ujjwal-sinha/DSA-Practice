package recursion;

public class optimisedpower {
    public static int optimixed(int x, int n) {

        if (n == 0) {
            return 1;
        }
        if (n % 2 == 0) {
            return optimixed(x, n / 2) * optimixed(x, n / 2);
        } else {
            return x * optimixed(x, n / 2) * optimixed(x, n / 2);
        }
    }

    public static void main(String[] args) {
        int x = 2;
        System.out.println(optimixed(x, 4));
    }
}
