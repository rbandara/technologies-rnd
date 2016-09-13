package com.learn.threads;

public class NotThreadSafe {

    private StringBuffer stringBuffer = new StringBuffer();

    public void append(String string) {
        this.stringBuffer.append(string);
    }

    public String getValue() {
        return this.stringBuffer.toString();
    }

    public static void main(String[] args) {

        NotThreadSafe shared = new NotThreadSafe();

        new Thread(new MyRunnable(shared)).start();
        new Thread(new MyRunnable(shared)).start();

    }
}

class MyRunnable implements Runnable {

    NotThreadSafe instance;

    MyRunnable(NotThreadSafe instance) {
        this.instance = instance;
    }

    @Override
    public void run() {
        this.instance.append(" text ");
        System.out.println(this.instance.getValue());
    }
}


