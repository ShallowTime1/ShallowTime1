package com.situ;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 代码题给定一个正整数n, 输出1到n的所有排列 输入 3 输出 123, 132, 213, 231, 312, 321
 * 思路分析：
 * 递归： f(n)的结果等于将n插入f(n-1)的结果中每一个数字的不同位置。如n=3，将3插入12/21的前中后位置
 * 把n-1的结果集处理成字符数组，创建新的数组，在不同位置插入n的值，得到新的数组
 * 再把新的字符数组转为字符串存入集合中
 * 集合中便存放了所有的排列结果
 * @author zyj
 *
 */
public class TestDemo {

    // 递归实现列举所有排列
    public static Set<String> selectAllArrange(int n) {
        Set<String> set = new HashSet<String>();
        if (1 == n) {
            set.add("1");
        } else {
            Set<String> oldSet = selectAllArrange(n - 1);
            // 遍历n-1时得到的结果
            for (String str : oldSet) {
                // 将每个字符串转为字符数组
                char[] oldArray = str.toCharArray();
                for (int i = 0; i < n; i++) {
                    char[] newArray = new char[n];
                    // 新数组是原数组插入n后的结果
                    for (int j = 0; j < n; j++) {
                        if (j < i) {
                            newArray[j] = oldArray[j];
                        } else if (j == i) {
                            newArray[j] = String.valueOf(n).charAt(0);
                        } else {
                            newArray[j] = oldArray[j - 1];
                        }
                    }
                    // 将数组转为字符串，存入集合
                    String s = String.valueOf(newArray);
                    set.add(s);
                }
            }
        }

        return set;
    }

    // 测试方法
    public static void main(String[] args) {
        System.out.println("请输入n的值：");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<String> set = selectAllArrange(n);
        System.out.println("共有" + set.size() + "种排列组合");
        System.out.println(set);
    }
}