package Sorting;

/**
 * Quick Sort
 * Best Case : nlogn
 * Average Case : nlogn
 * Worst Case : n2
 */
public class Alg4_QuickSort {

    public static void main(String[] args) {
        int ar[] = {2 , 4 , 6 , 8 , 10 , 12 , 14 , 16 , 18 , 20};
        quickSort(ar, 0, ar.length - 1);
        printArray(ar);
    }

    public static void quickSort(int[] ar, int start, int end) {
        if (start < end) {
            int p = partitionRev(ar, start, end);
            quickSort(ar, 0, p - 1);
            quickSort(ar, p + 1, end);
        }
    }
    public static int partitionRev(int[] ar, int start, int end) {
        int pivot = ar[end];
        int i = start;
        for (int j = start; j < end; j++) {
            if (ar[j] > pivot) {
                int temp1 = ar[j];
                ar[j] = ar[i];
                ar[i] = temp1;
                i++;
            }
        }
        int temp2 = ar[i];
        ar[i] = ar[end];
        ar[end] = temp2;

        return i;
    }
    public static int partition(int[] ar, int start, int end) {
        int pivot = ar[end];
        int i = start;
        for (int j = start; j < end; j++) {
            if (ar[j] <= pivot) {
                int temp1 = ar[j];
                ar[j] = ar[i];
                ar[i] = temp1;
                i++;
            }
        }
        int temp2 = ar[i];
        ar[i] = ar[end];
        ar[end] = temp2;

        return i;
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.println(arr[i]);
        System.out.println();
    }
}