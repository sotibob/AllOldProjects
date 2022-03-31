/*******************
*Sotonte Bob-manuel
*Lab #5
********************/

import java.io.*;

public class FileWrite
{
	public FileWrite(String fn, String txt)
	{
		try
		{
			String s1 = txt;
			byte bArr[] = new byte[s1.length()];
			bArr = s1.getBytes();
			
			File f1 = new File(fn);
			long sz = f1.length();
			if (sz == 0)
			{
				FileOutputStream fOut = new FileOutputStream(f1);
				fOut.write(bArr);
				fOut.close();
			}
			else
			{
				System.out.println("This File is not empty");
			}
		}
		catch(IOException ie)
		{
			System.out.println(ie);
		}
	}
	
	public static void main(String[] args)
	{
		FileWrite fw = new FileWrite("myfile.txt", "Go Braves"); 
	}
}