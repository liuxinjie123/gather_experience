package com.experience.service;

public class TryCatchFinally {
    public static void main(String[] args) {
        int res1 = test001();
        System.out.println(" res1: " + res1);
        int res2 = test002();
        System.out.println(" res2: " + res2);
        int res3 = test003();
        System.out.println(" res3: " + res3);
    }

    public static int test001() {
        try {
            int a = Integer.valueOf("a");
            return a;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("测试 111 。。。。。。。。。。。。。。。。");
        }
        return 0;
    }

    public static int test002() {
        try {
            int a = Integer.valueOf("100");
            return a;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("测试 222 。。。。。。。。。。。。。。。。");
        }
        return 0;
    }

    public static int test003() {
        try {
            int a = Integer.valueOf("a");
            return a;
        } catch (Exception e) {
            return 0;
        } finally {
            System.out.println("测试 333 .。。。。。。。。。。。。。。。");
        }
    }
}
