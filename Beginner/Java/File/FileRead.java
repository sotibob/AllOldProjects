/*******************
*Sotonte Bob-manuel
*Lab #5
********************/

import java.io.*;

public class FileRead
{
	public FileRead(String fn)
	{
		try
		{
			File f1 = new File(fn);
			long sz = f1.length();
			String s2;
			byte bArr[] = new byte[(int)f1.length()]; 
			
			FileInputStream fIn = new FileInputStream(f1);
			fIn.read(bArr);
			fIn.close();
			s2 = new String(bArr);
			if(sz > 0)
			{
				System.out.println("The Data from the File reads: " + s2);
			}
			else
			{
				System.out.println("The File is empty.");
			}
		}
		catch(IOException ie)
		{
			System.out.println(ie);
		}
	}
	
	public static void main(String[] args)
	{
		FileRead fr = new FileRead("myfile.txt"); 
	}
}