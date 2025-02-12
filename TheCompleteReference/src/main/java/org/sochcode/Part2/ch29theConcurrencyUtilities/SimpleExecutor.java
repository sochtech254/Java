package Part2.ch29theConcurrencyUtilities;

// A simple example that uses an Executor.
import java.util.concurrent.*;

class SimpleExecutor
{
    public static void main(String[] args)
    {
        CountDownLatch cdl = new CountDownLatch(5);
        CountDownLatch cdl2 = new CountDownLatch(5);
        CountDownLatch cdl3 = new CountDownLatch(5);
        CountDownLatch cdl4 = new CountDownLatch(5);
        ExecutorService es = Executors.newFixedThreadPool(2);

        System.out.println("Starting");

        // Start the threads.
        es.execute(new MyThread4(cdl, "A"));
        es.execute(new MyThread4(cdl, "B"));
        es.execute(new MyThread4(cdl, "C"));
        es.execute(new MyThread4(cdl, "D"));

        try
        {
            cdl.await();
            cdl2.await();
            cdl3.await();
            cdl4.await();
        } catch (InterruptedException exc)
        {
            System.out.println(exc);
        }

        es.shutdown();
        System.out.println("Done");
    }
}

class MyThread4 implements Runnable
{
    String name;
    CountDownLatch latch;

    MyThread4(CountDownLatch c, String n)
    {
        latch = c;
        name = n;
    }

    @Override
    public void run()
    {
        for (int i = 0; i < 5; i++)
        {
            System.out.println(name + ": " + i);
            latch.countDown();
        }
    }
}
