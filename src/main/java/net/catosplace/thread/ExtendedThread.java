package net.catosplace.thread;

/**
 * Created by psellars on 25/03/15.
 */
public class ExtendedThread extends Thread {

    @Override
    public void run() {
        System.out.println("Hello from the ExtendedThread!");
    }

    public static void main(String args[]) {
        (new ExtendedThread()).start();
    }
}
