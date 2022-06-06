/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Sotonte Bob-manuel
 */
public class ChatServerData extends Thread
{
    String strl;
    String txt;
    
    public ChatServerData()
    {
        
    }
    
    public void run()
    {
        System.out.println("Executing Server");
        try
        {
            ServerSocket ss = new ServerSocket(7777);
            Socket s1 = ss.accept();
            BufferedReader br = new BufferedReader(new InputStreamReader(s1.getInputStream()));
            this.strl = br.readLine();
            System.out.println(strl);
        }
        catch (Exception e)
        {
            System.out.println("Error in SocketSetup() Server");
        }
    }
    
    public ChatServerData(String text)
    {
        this.txt = text;
        System.out.println("Executing Client");
        try 
        {
            ServerSocket ss = new ServerSocket(7777);
            Socket s1 = ss.accept();
            PrintStream pout = new PrintStream(s1.getOutputStream());
            pout.println(txt);
        }
        catch (Exception e)
        {
            System.out.println("Error in socketSetup() Server");
        }
    }
    
    public String getStrl()
    {
        return strl;
    }
}
