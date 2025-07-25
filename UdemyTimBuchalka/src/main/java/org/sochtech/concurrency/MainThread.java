package org.sochtech.concurrency;

import static org.sochtech.concurrency.ThreadColor.*;

public class MainThread
{
    public static void main(String[] args)
    {
        System.out.println(ANSI_PURPLE + "Hello from the main thread");

        final Thread anotherThread = new Thread(new AnotherThread());
        anotherThread.setName("== Another Thread ==");
        anotherThread.start();

        new Thread(() -> System.out.println(ANSI_GREEN + "Hello from the anonymous class thread")).start();

//        new Thread()
//        {
//            @Override
//            public void run() {
//                System.out.println("Hello form the anonymous class thread.");
//            }
//        }.start();

        Thread myRunnableThread = new Thread(new MyRunnable()
        {
            @Override
            public void run() {
                System.out.println(ANSI_RED + "Hello from the anonymous class's implementation of run()");
                try
                {
                    anotherThread.join(2000);
                    System.out.println(ANSI_RED + "AnotherThread terminated, or timed out so, I'm running again");
                } catch (InterruptedException e)
                {
                    System.out.println(ANSI_RED + "I couldn't wait after all. I was interrupted");
                }
            }
        });
        myRunnableThread.start();
//        anotherThread.interrupt();

        System.out.println(ANSI_RED + "Hello again from the main thread");
    }
}
