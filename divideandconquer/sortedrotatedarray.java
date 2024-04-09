package divideandconquer;

public class sortedrotatedarray {
    public static int search(int arr[], int si, int ei, int target) {

        if (si > ei) {
            return -1;
        }
        int mid = si + (ei - si) / 2;
        if (arr[mid] == target) {
            return mid;
        }

        // linel1
        if (arr[si] <= arr[mid]) {

            if (arr[si] <= target && target <= arr[mid]) {
                return search(arr, si, mid - 1, target);
            } else {
                return search(arr, mid + 1, ei, target);
            }
        }
        // linel2
        else {
            if (arr[mid] <= target && target <= arr[ei]) {
                return search(arr, mid + 1, ei, target);
            } else {
                return search(arr, si, mid - 1, target);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        System.out.println(search(arr, 0, arr.length - 1, target));
    }
}
