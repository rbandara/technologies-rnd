package com.learn.threads;

public class ThreadedHello implements Runnable {

    private String param;

    public ThreadedHello(String param) {
        this.param = param;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println("This is from the run method " + param + ":" + i +" thread id " );
        }
    }

    public static void main(String[] args) {
        ThreadedHello hello1 = new ThreadedHello("A");
        Thread thread1 = new Thread(hello1);
        thread1.start();
        thread1.run();

        ThreadedHello hello2 = new ThreadedHello("B");
        Thread thread2 = new Thread(hello2);
        thread2.start();
    }
}
