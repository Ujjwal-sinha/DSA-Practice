package sorting;

public class selectionsort {
    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }

    public static void selection(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minpos = i;
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[minpos] > arr[j]) {
                    minpos = j; // updating the min position
                }
            }
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 34, 5, 6, 22, 4 };
        selection(arr);
        print(arr);
    }
}
