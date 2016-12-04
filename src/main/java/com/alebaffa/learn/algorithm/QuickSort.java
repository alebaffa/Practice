package com.alebaffa.learn.algorithm;

import java.util.Arrays;

/**
 * Created by alebaffa on 29/11/16.
 */
public class QuickSort {
    public static void main(String[] args) {

        int[] a = {4, 2, 1, 7, 8, 5};

        quicksort(a, 0, a.length - 1);

        System.out.println(Arrays.toString(a));
    }

    private static void quicksort(int[] a, int low, int high) {
        int i = low, j = high;
        int middle = low + (high - low) / 2;
        int pivot = a[middle];

        while (i <= j){
            while (a[i] < pivot) i++;
            while (a[j] > pivot) j--;
            if(i <= j){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            quicksort(a, low, j);
        if (high > i)
            quicksort(a, i, high);
    }
}