package com.example.day03.thread;

import javax.print.DocFlavor;

public class Test1 {
    public static void main(String[] args) {
        String newString = new String("");
        try {
            newString.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
