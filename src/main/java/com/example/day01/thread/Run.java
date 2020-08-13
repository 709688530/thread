package com.example.day01.thread;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();
        myThread.sleep(200);
        myThread.interrupt();
        myThread.isInterrupted();
        System.out.println("zzzzzzzzzzz");
    }
}
