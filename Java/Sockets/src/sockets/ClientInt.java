/*******************
*Sotonte Bob-manuel
*Lab #11
********************/

import java.net.*;
import java.io.*;

public class ClientInt
{
    public ClientInt()
    {
        System.out.println("Executing Server");
        try
        {
            int[] Arr = {10, 15, 20, 25, 30};
            Socket s1 = new Socket("localhost", 7777);
            DataOutputStream dout = new DataOutputStream(s1.getOutputStream());
            for(int i = 0; i < Arr.length; i++)
            {
                dout.writeInt(Arr[i]);
            }
        }
        catch (Exception e)
        {
            System.out.println("Error in Client socketSetup()");
        }
    }

    public static void main(String[] args)
    {
        ClientInt c1 = new ClientInt();
    }
}