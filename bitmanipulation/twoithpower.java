package bitmanipulation;

public class twoithpower {

    public static boolean power(int n) {
        return (n & (n - 1)) == 0;

    }

    public static void main(String[] args) {
        System.out.println(power(8));
    }
}
