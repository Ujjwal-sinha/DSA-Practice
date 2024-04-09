package recursion;

public class decordofn {
    public static void decresion(int n) {
        if (n == 1) {
            System.out.print(1);
            return;

        }
        System.out.println(n);
        decresion(n - 1);
    }

    public static void main(String[] args) {
        int n = 10;
        decresion(n);
    }
}
