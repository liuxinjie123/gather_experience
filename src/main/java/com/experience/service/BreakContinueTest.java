package com.experience.service;

public class BreakContinueTest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 3) break;
            System.out.println("break test: " + i);
        }
        System.out.println("break end");
        for (int i = 0; i < 10; i++) {
            if (i == 3) continue;
            System.out.println("continue test: " + i);
        }
        System.out.println("continue end");
    }
}
