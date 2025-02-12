package org.sochCode;

class MyThread implements Runnable
{
    Thread t;

    MyThread()
    {
        // Create a new, second thread
        t = new Thread(this, "Demo Thread");
    }

    @Override
    public void run()
    {
        try
        {
            for (int i = 0; i < 20; i++)
            {
                System.out.println(i);
                Thread.sleep(1000);
            }

        } catch (InterruptedException e)
        {
            System.out.println(e);
        }

    }
}
class TimedForTest
{
    public static void main(String[] args)
    {
        MyThread mt = new MyThread();
        mt.t.start();
    }
}
