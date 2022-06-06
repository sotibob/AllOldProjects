/*******************
*Sotonte Bob-manuel
*Lab #11
********************/
package sockets;

import java.net.*;
import java.io.*;

public class ClientString
{
    public ClientString()
    {
        System.out.println("Executing Client");
        try 
        {
            Socket s1 = new Socket("localhost", 7777);
            BufferedReader br = new BufferedReader(new InputStreamReader(s1.getInputStream()));
            String strl = br.readLine();
            System.out.println(strl);
        }
        catch (Exception e)
        {
            System.out.println("Error in socketSetup()");
        }
    }

    public static void main(String[] args)
    {
        ClientString c1 = new ClientString();
    }
}