package com.situ;

public class Dailytest extends Thread{

    int t = 1;
    @Override
    public void run() {
        while (true) {
            System.out.println(++t);
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread();
        thread.start();
    }
}
