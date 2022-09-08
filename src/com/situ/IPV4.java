package com.situ;

import java.sql.SQLOutput;
import java.util.Scanner;

public class IPV4 {

    public static void main(String[] args) {
        //012.456.891.345
        Scanner sc = new Scanner(System.in);
        String ipv = sc.nextLine();
        String[] strs = new String[4];
        for (int i = 0; i < 4; i++) {
            strs[i] = ipv.substring(0,3);
            if (i < 3) {
                ipv = ipv.substring(4);
            }
        }
        int flag = 1;
        for (int i = 0; i < 4; i++) {
            if (Integer.parseInt(strs[i]) <= 0 && Integer.parseInt(strs[i]) >= 255) {
                flag = 0;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("是 IPV4");
        } else {
            System.out.println("not IPV4");
        }
    }
}
