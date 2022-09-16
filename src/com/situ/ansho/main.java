package com.situ.ansho;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class main {

    public static void main(String[] args) throws IOException {
         int[] arr = {1, 2, 3 ,4 ,5 ,6 ,7};
         int[] sr = sort(arr);
         String str = "";
        for (int i = 0; i < sr.length - 1; i++) {
            str  = str + sr[i] + ", ";
        }
        str += sr[sr.length - 1];
        write(str);
    }

    public static int[] sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n - i ; j++) {
                if (arr[j] > arr[j + 1]) {
                   int temp = arr[j];
                   arr[j] = arr[j + 1] ;
                   arr[j + 1] = temp;
                }
            }
        }
        int[] arrs = new int[n];
        int top = n;
        int index = 0;
        for (int i = 0; i < n; i++) {
            if(i % 2 == 0) {
                arrs[i] = arr[top - 1];
                top--;
            } else {
                arrs[i] = arr[index];
                index++;
            }
        }
        return arrs;
    }

    public static void write(String str) throws IOException {
        FileOutputStream fileOutputStream = null;
        File file = new File("F:\\2207JAVA\\DailyTest\\src\\com\\situ\\ansho\\test");
        fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(str.getBytes(StandardCharsets.UTF_8));
        fileOutputStream.flush();
        fileOutputStream.close();
    }

}
