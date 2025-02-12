package org.sochcode.Part2.ch24networking;

// Demonstrate InetAddress
import java.net.*;

class InetAddressTest
{
    public static void main(String[] args) throws UnknownHostException
    {
        InetAddress Address = InetAddress.getLocalHost();
        System.out.println(Address);

        Address = InetAddress.getByName("www.HerbSchildt.com");
        System.out.println(Address);

        InetAddress[] sw = InetAddress.getAllByName("www.nba.com");
        for (InetAddress inetAddress : sw) System.out.println(inetAddress);
    }
}
