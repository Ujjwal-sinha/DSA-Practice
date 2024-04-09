package recursion;

public class friendpairproblem {

    public static int friparitways(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        int fn1 = friparitways(n - 1);
        int fn2pair = (n - 1) * friparitways(n - 2);

        int totalways = fn1 + fn2pair;

        return totalways;

    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(friparitways(n));
    }  
}
