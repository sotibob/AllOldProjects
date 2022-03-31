/*******************
*Sotonte Bob-manuel
*Lab #11
********************/

import java.net.*;
import java.io.*;

public class ServerInt
{
    public ServerInt()
    {
        System.out.println("Executing Server");
        try
        {
            int[] Arr = new int[5];
            ServerSocket ss = new ServerSocket(7777);
            Socket s1 = ss.accept();
            DataInputStream din = new DataInputStream(s1.getInputStream()); 
            System.out.println("Your numbers are: ");
            for(int i = 0; i < Arr.length; i++)
            {
                Arr[i] = din.readInt();
                System.out.println("       " + Arr[i]);
            }
        }
        catch (Exception e)
        {
            System.out.println("Error in Server socketSetup()");
        }
    }

    public static void main(String[] args)
    {
        ServerInt s1 = new ServerInt();
    }
}