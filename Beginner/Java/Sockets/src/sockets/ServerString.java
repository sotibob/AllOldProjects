/*******************
*Sotonte Bob-manuel
*Lab #11
********************/

package sockets;

import java.net.*;
import java.io.*;

public class ServerString
{
    public ServerString()
    {
        System.out.println("Executing Server");
        try
        {
            ServerSocket ss = new ServerSocket(7777);
            Socket s1 = ss.accept();
            PrintStream pout = new PrintStream(s1.getOutputStream());
            pout.println("Go Braves");
        }
        catch (Exception e)
        {
            System.out.println("Error in socketSetup()");
        }
    }

    public static void main(String[] args)
    {
        ServerString s1 = new ServerString();
    }
}