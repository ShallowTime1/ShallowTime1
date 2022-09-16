package com.situ.newtest;

import java.util.Scanner;

public class dajia {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int max = total(nums);
    }

    private static int total(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return nums[0];
        }
        int[] f = new int[n + 1], g = new int[n + 1];
        f[1] = nums[0];
        g[2] = nums[1];
        for (int i = 2 ; i <= n -1; i++) {
            f[i] = Math.max(f[i - 1], f[i - 2] + nums[i - 1]);
        }
        for (int i = 3; i <= n; i++) {
            g[i] = Math.max(g[i - 1], g[i -2] + nums[i -1]);
        }
        return Math.max(f[n - 1], g[n]);
    }
}
