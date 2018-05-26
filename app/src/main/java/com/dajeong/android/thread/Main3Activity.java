package com.dajeong.android.thread;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        MyRunnable runnableA = new MyRunnable("AA:");
        new Thread(runnableA).start(); // Runnable을 상속받을때는 Thread를 new해줘야 한다.
        MyRunnable runnableB = new MyRunnable("BB:");
        new Thread(runnableB).start(); // Runnable을 상속받을때는 Thread를 new해줘야 한다.
    }
}

class MyRunnable implements Runnable{
    String name="";
    public MyRunnable(String name){
        this.name = name;
    }

    @Override
    public void run() {
        for(int i =0; i <=10; i++){
            sleep(100);
            System.out.println(name+i);
        }

    }

    public void sleep(int time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
