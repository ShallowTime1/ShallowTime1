package com.situ;

import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Quchong {

    public static void main(String[] args) {
        int[] arr = {17, 1, 3, 4, 2, 6, 2, 5, 6, 4, 3, 7};
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }
        Object[] objects = set.toArray();
        int[] arr2 = new int[objects.length];
        for (int i = 0; i < objects.length; i++) {
            arr2[i] = (int)objects[i];
        }
        for (int i = 1; i < arr2.length ; i++) {
            for (int j = 0; j < arr2.length - i; j++) {
                if (arr2[j] > arr2[j + 1]) {
                    int t = arr2[j];
                    arr2[j] = arr2[j + 1];
                    arr2[j + 1] = t;
                }
            }
        }
        for (int i : arr2) {
            System.out.println(i);
        }
    }

    @Test
    public void test1() {
        String a = new String("方面");
        int i = a.hashCode();
        String b = new String("树人");
        int i1 = b.hashCode();
        System.out.println("a:" + i);
        System.out.println("b:" + i1);

    }
}
