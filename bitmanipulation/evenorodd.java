package bitmanipulation;

public class evenorodd {
    public static void chkevod(int n) {
        int bit = 1;
        if ((n & bit) == 0) {
            System.out.println("even number");
        } else {
            System.out.println("oddnumber");
        }
    }

    public static void main(String[] args) {
        chkevod(2);
        chkevod(47);
    }
}
