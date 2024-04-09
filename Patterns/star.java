package Patterns;

class star {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int star = 1; star <= i; star++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}