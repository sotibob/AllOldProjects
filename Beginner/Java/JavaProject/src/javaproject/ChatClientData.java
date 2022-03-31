/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

/**
 *
 * @author Sotonte Bob-manuel
 */
public class ChatClientData extends Thread
{
    String strl;
    String txt;
    
    public ChatClientData()
    {
        
    }
    
    public void run()
    {
        System.out.println("Executing Client");
        try 
        {
            Socket s1 = new Socket("localhost", 7777);
            BufferedReader br = new BufferedReader(new InputStreamReader(s1.getInputStream()));
            this.strl = br.readLine();
            System.out.println(strl);
        }
        catch (Exception e)
        {
            System.out.println("Error in SocketSetup() Client");
        }
    }
    
    public ChatClientData(String text)
    {
        this.txt = text;
        System.out.println("Executing Client");
        try 
        {
            Socket s1 = new Socket("localhost", 7777);
            PrintStream pout = new PrintStream(s1.getOutputStream());
            pout.println(txt);
        }
        catch (Exception e)
        {
            System.out.println("Error in socketSetup() Client");
        }
    }
    
    public String getStrl()
    {
        return strl;
    }
}
