package com.dajeong.android.thread;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Thread(){ //subThread가 됨.
            @Override
            public void run() { //자동 호출
                for(int i =0; i<=10; i++){
                    sleep(100);
                    System.out.println("A :"+i);
                }
            }
            public void sleep(int time){
                try {
                    Thread.sleep(time);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();



        //mainThread
        for(int i =0; i<=10; i++){
            sleep(100);
            System.out.println("B :"+i);
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
