package com.situ;

import java.util.Scanner;

public class hande {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max1 = 1;
        int n1 = n;
        while (n1 > 0) {
            max1 *= n1;
            n1--;
        }
        int n2 = n - 1;
        int max2 = 1;
        while (n2 > 0) {
            max2 *= n2;
            n2--;
        }
        System.out.println((double) max2 / max1);
    }
}
