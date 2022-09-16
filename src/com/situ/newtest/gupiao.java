package com.situ.newtest;

import java.util.Scanner;

public class gupiao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int prices[] = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }
        int i = maxP(k, prices);
        System.out.println(i);
    }

    public static int maxP(int k, int[] prices) {
        if (k <= 0) {
            return 0;
        }
        if (prices.length < 2) {
            return 0;
        }
        if (k > prices.length / 2) {
            return maxProfitOf(prices);
        }
        int[][] dp = new int[k][2];
        for (int i = 0; i < 2; i++) {
            dp[i][1] = Integer.MIN_VALUE;
        }

        for (int price : prices) {
            for (int i = 0; i < k; i++) {
                if (i == 0) {
                    dp[i][1] = Math.max(dp[i][1], -price);
                } else {
                    dp[i][1] = Math.max(dp[i][1], dp[i - 1][0] - price);
                }
                dp[i][0] = Math.max(dp[i][0], dp[i][1] + price);
            }

        }
        return dp[k - 1][0];
    }

    private static int maxProfitOf(int[] prices) {
        int n = prices.length;
        if (n < 2) {
            return 0;
        }
        int dp_i0 = 0;
        int dp_i1 = Integer.MIN_VALUE;
        for (int price : prices) {
            dp_i0 = Math.max(dp_i0, dp_i1 + price);
            dp_i1 = Math.max(dp_i1, dp_i0 - price);
        }
        return dp_i0;
    }
}


