package divideandconquer;

public class mergesort {
    public static void sorting(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = (si + ei) / 2;
        sorting(arr, si, mid);
        sorting(arr, mid + 1, ei);
        merge(arr, mid, si, ei);

    }

    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        // for leftover element of 1st sorted part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        // for leftover element of 2nd sorted part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 1, 65 };
        sorting(arr, 0, arr.length - 1);
        printarr(arr);
    }
}
