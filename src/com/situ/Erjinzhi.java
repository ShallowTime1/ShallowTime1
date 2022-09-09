package com.situ;

import java.util.Scanner;

public class Erjinzhi {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < str.length; i++) {
            str[i] = "";
        }
        //int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            int index = i;
            while ( index != 0) {
                str[i] += index % 2;
                index /= 2;
            }
        }
        for (String s : str) {
            System.out.println(s);
        }
    }
}
