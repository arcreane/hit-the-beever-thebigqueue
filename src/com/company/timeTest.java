package com.company;

import java.util.Timer;
import java.util.TimerTask;

public class timeTest {
    public static void timer() {
        Timer chrono = new Timer();
        chrono.schedule(new TimerTask() {
            int time = 10;

            @Override
            public void run() {
                System.out.println("Hello");
                time--;
                if (time == 0) {
                    cancel();
                } ;
            }
        }, 3000, 1000);
    }
}
