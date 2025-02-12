package Part2.ch29theConcurrencyUtilities;

// An example of Exchanger.

import java.util.concurrent.Exchanger;

class ExchangerDemo
{
    public static void main(String[] args)
    {
        Exchanger<String> exgr = new Exchanger<>();

        new Thread(new UseString(exgr)).start();
        new Thread(new MakeString(exgr)).start();
    }
}

// A Thread that constructs a string.
class MakeString implements Runnable
{
    Exchanger<String> ex;
    String str;

    MakeString(Exchanger<String> c)
    {
        ex = c;
        str = new String();
    }

    @Override
    public void run()
    {
        char ch = 'A';

        for (int i = 0; i < 3; i++)
        {
            // Fill Buffer
            for (int j = 0; j < 5; j++)
                str += ch++;

            try
            {
                // Exchange a full buffer for an empty one.
                str = ex.exchange(str);
            } catch (InterruptedException exc) {
                System.out.println(exc);
            }
        }
    }
}

// A Thread that uses a string.
class UseString implements Runnable
{
    Exchanger<String> ex;
    String str;

    UseString(Exchanger<String> c)
    {
        ex = c;
    }

    @Override
    public void run()
    {
        for (int i = 0; i < 3; i++)
        {
            try
            {
                // Exchange an empty buffer for a full one.
                str = ex.exchange(new String());
                System.out.println("Got: " + str);
            } catch (InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}
