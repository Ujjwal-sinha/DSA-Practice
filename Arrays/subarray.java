package Arrays;

public class subarray {
    public static void perintsubarray(int num[]) {
        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(num[k] + " ");

                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int num[] = { 12, 13, 14, 15, 16, 17 };
        perintsubarray(num);
    }
}
