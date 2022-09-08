package com.situ;

import java.util.Scanner;

public class ArrChange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        int arr1[] = new int[n];
        int index = 0;
        for (int i = t - 1 ; i < n ; i++) {
            arr1[index] = arr[i];
            index++;
        }
        for (int i = 0 ; i < t - 1  ; i++) {
            arr1[index] = arr[i];
            index++;
        }
        for (int i : arr1) {
            System.out.println(i);
        }
    }
}
