
public class MergeSort {
    void merge(int a[], int l, int h) {
        int mid = (h + l) / 2;
        int i = l, k = l, j = mid + 1;

        int tmp[] = new int[a.length];

        while (i <= mid && j <= h) {
            if (a[i] < a[j])
                tmp[k++] = a[i++];
            else
                tmp[k++] = a[j++];
        }
        while (i <= mid) {
            tmp[k++] = a[i++];
        }
        while (j <= h) {
            tmp[k++] = a[j++];
        }

        for (i = l; i <= h; i++)
         {
            a[i] = tmp[i];
        }
    }
    void sort(int arr[], int l, int r)
     {
        if (l < r) {
            // Find the middle point
            int m = l + (r - l) / 2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, r);
        }
    }
    static void printArray(int arr[])
     {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) 
    {
        int arr[] = { 12, 11, 13, 5, 6, 7, -1, 0 };

        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array");
        printArray(arr);
    }
}