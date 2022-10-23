package Homework_3;

public class Task1mergeSort {
    //    Реализовать алгоритм сортировки слиянием
    public static void mergeSort(int[] a) {
        int n = a.length;
        if (n == 1) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = 0; i < n - mid; i++) {
            r[i] = a[i + mid];
        }

        mergeSort(l);
        mergeSort(r);
        merge(a, l, r);

    }

    public static void merge(int[] a, int[] l, int[] r) {
        int left = l.length;
        int right = r.length;
        int i = 0;
        int j = 0;
        int idx = 0;

        while (i < left && j < right) {
            if (l[i] < r[j]) {
                a[idx] = l[i];
                i++;
                idx++;
            } else {
                a[idx] = r[j];
                j++;
                idx++;
            }
        }

        for (int ll = i; ll < left; ll++) {
            a[idx++] = l[ll];
        }
        for (int rr = j; rr < right; rr++) {
            a[idx++] = r[rr];
        }

    }
}

