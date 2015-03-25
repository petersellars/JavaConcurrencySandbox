package net.catosplace.thread;

/**
 * Created by psellars on 25/03/15.
 */
public class RunnableThread implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello from the RunnableThread!");
    }

    public static void main(String[] args) {
        (new Thread(new RunnableThread())).start();
    }
}
