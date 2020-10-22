package ex;

import java.util.Map.Entry;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args) {
        Timer chrono = new Timer();
        chrono.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("salut");
            }
        }, 3000);
    }
}
