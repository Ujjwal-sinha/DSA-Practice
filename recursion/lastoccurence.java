package recursion;

public class lastoccurence {
    public static int lastocc(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;

        }
        int isfound = lastocc(arr, key, i + 1);
        if (isfound == -1 && arr[i] == key) {
            return i;
        }
        return isfound;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 5 };
        int key = 5;
        System.out.println(lastocc(arr, key, 0));

    }
}
