/*******************
*Sotonte Bob-manuel
*Lab #6
********************/

import java.io.*;

public class ReadInts
{
	public ReadInts(String fn)
	{
		try
		{
			int[] x = new int[5];
			File f1 = new File(fn);
			long sz = f1.length();
			if (sz != 0)
			{
				FileInputStream fin = new FileInputStream(f1);
				DataInputStream din = new DataInputStream(fin); 
				for (int i = 0; i <= 4; i++)
				{
					x[i] = din.readInt();
					System.out.println(x[i]);
				}
				din.close();
			}
		}
		catch (IOException ie)
		{
			System.out.println(ie);
		}
	}
	
	public static void main(String[] args)
	{
		ReadInts ri = new ReadInts("mydata.dat");
	}
}