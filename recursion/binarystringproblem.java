package recursion;

public class binarystringproblem {
    public static void consecutive(int n, int lastplace, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        consecutive(n - 1, 0, str + "0");
        if (lastplace == 0) {
            consecutive(n - 1, 1, str + "1");
        }
    }

    public static void main(String[] args) {
        consecutive(3, 0, "");
    }
}
