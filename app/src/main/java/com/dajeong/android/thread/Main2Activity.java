package com.dajeong.android.thread;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        MyThread myThreadA = new MyThread();
        myThreadA.start();

        MyThread myThreadB = new MyThread();
        myThreadB.start();

    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        for(int i =0; i<=10; i++){
            sleep(100);
            System.out.println(getName()+": "+i);
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
