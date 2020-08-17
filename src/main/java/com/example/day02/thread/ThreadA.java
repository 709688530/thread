package com.example.day02.thread;

public class ThreadA extends Thread {
    private HasSelfPrivateNum numRef;
    @Override
    public void run() {
        super.run();
        numRef.addI("a");
    }

    public ThreadA(HasSelfPrivateNum numRef){
        this.numRef = numRef;

    }
}
