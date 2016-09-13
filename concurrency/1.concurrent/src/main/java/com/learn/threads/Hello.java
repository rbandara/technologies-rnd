package com.learn.threads;

public class Hello {
    public static void main(String[] args) {
        System.out.println("com.learn.threads.Hello");

        Thread t = new Thread(){
            @Override
            public void run(){
                System.out.println("this is running from the run method " + this.getName());
            }
        };

        t.start();
    }
}