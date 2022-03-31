/*******************
*Sotonte Bob-manuel
*Lab #6
********************/

import java.io.*;

public class WriteInts
{
	public WriteInts(String fn, int[] Arr)
	{
		try
		{
			int x[] = Arr;
			File f1 = new File(fn);
			long sz = f1.length();
			if (sz == 0)
			{
				FileOutputStream fout = new FileOutputStream(f1);
				DataOutputStream dout = new DataOutputStream(fout);
				for (int i = 0; i <= 4; i++)
				{
					dout.writeInt(x[i]);
				}
				dout.close();
			}
		}
		catch(IOException ie)
		{
			System.out.println(ie);
		}
	}
	
	public static void main(String[] args)
	{
		int myArr[] = {16, 31, 90, 45, 89};
		WriteInts wi = new WriteInts("mydata.dat", myArr);
	}
}