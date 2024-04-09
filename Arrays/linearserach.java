package Arrays;

class linearserach {
    public static int linser(int key, int num[]) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int num[] = { 1, 2, 3, 4, 5, 6 };
        int key = 6;
        int index = linser(key, num);

        if (index == -1) {
            System.out.print("not found");
        } else {
            System.out.println("found");
        }
    }

}