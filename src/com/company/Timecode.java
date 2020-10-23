package com.company;

import java.util.TimerTask;

public class Timecode {
    static public void  timer1() {
        java.util.Timer chrono = new java.util.Timer();
        chrono.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("salut");
            }
        }, 3000);
    }
}
