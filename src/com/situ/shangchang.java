package com.situ;

import java.util.Scanner;

public class shangchang {

    public static void main(String[] args) {
        String str1 = new String();
        String str2 = new String();
        Scanner sc = new Scanner(System.in);
        str1 = sc.nextLine();
        str2 = sc.nextLine();
        String[] spl1 = str1.split(",");
        String[] spl2 = str2.split(",");
        int pA[] = new int[str1.length() + 1];
        int pB[] = new int[str2.length() + 1];
        for (int i = 0; i < spl1.length; i++) {
            pA[i] = Integer.parseInt(spl1[i]);
        }
        for (int i = 0; i < spl2.length; i++) {
            pB[i] = Integer.parseInt(spl2[i]);
        }
        int num = 0;
        if (spl1.length % 3 == 0) {
            for (int i = 0; i < 3; i++) {
                num += pA[i];
            }
            num = (int) (num * 0.6);
            System.out.println(num);
        }
    }
}
