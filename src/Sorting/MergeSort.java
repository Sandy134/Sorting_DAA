package Sorting;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MergeSort {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Enter the value of n:");
        int n = in.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = rand.nextInt(100);
        }

        System.out.println("Array before sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();

        long start = System.currentTimeMillis();
        sort(a, 0, n - 1);
        long end = System.currentTimeMillis();

        System.out.println("Time complexity:" + (end - start));

        System.out.println("Array after sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void sort(int a[], int beg, int end) {
       
        if (beg < end) {
            int mid = (beg + end) / 2;
            sort(a, beg, mid);
            sort(a, mid + 1, end);
            merge(a, beg, mid, end);
        }
    }

    public static void merge(int a[], int beg, int mid, int end) {
        int i = beg, j = mid + 1, k;
        ArrayList<Integer> temp = new ArrayList<>();
        while (i <= mid && j <= end) {
            if (a[i] < a[j]) {
                temp.add(a[i]);
                i++;
            } else {
                temp.add(a[j]);
                j++;
            }

        }

        if (j > end) {
            while (i <= mid) {
                temp.add(a[i]);
                i++;
            }
        } else {
            while (j <= end) {
                temp.add(a[j]);
                j++;
            }
        }

        k = beg;
        i=0;
        while (i < temp.size()) {
            a[k++] = temp.get(i++);
        }
        
    }
}
