package com.experience.service;

import java.time.LocalDateTime;

public class ThreadSleepTest extends Thread {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("time: " + LocalDateTime.now() + " , i: " + i);
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
