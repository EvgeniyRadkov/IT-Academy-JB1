package com.gmail.radzkovevgeni.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TaskThreeRunnable implements Runnable {

    private static final Integer TIME_FOR_SLEEP = 5000;

    @Override
    public void run() {
        synchronized (this) {
            String threadName = Thread.currentThread().getName();
            String time = new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
            System.out.println(threadName + " " + time);
            try {
                Thread.sleep(TIME_FOR_SLEEP);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
    }
}
