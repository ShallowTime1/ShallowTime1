package com.situ;

public class TestDemoA {

    public static void main(String[] args) {
        TestDemoA testDemoA = new TestDemoA();
        testDemoA.test1();
    }

    public void test1() {
        System.out.println("TestDemoA.test1");
        test2();
    }

    public void test2() {
        System.out.println("TestDemoA.test2");
        test1();
    }
}
