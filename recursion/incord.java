package recursion;

public class incord {

    public static void incresion(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        incresion(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        int n = 10;
        incresion(n);
    }
}
