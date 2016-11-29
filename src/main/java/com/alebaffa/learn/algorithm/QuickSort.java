package com.alebaffa.learn.algorithm;

import java.util.Random;

/**
 * Created by alebaffa on 29/11/16.
 */
public class QuickSort {
    public static void main(String[] args) {

        int[] a = {4, 2, 1, 7, 8, 5};

        quicksort(a, 0, a.length - 1);
    }

    private static void quicksort(int[] a, int low, int high) {
        int i = low, j = high;
        int pivot = a[low + (high - low) / 2];

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
        if (i > high)
            quicksort(a, i, high);


        for (int k = 0; k < a.length; k++) {
            System.out.println(a[k]);
        }
    }
}
