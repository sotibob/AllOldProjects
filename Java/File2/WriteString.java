/*******************
*Sotonte Bob-manuel
*Lab #6
********************/

import java.io.*;

public class WriteString
{
	public WriteString(String fn, String txt)
	{
		try
		{
			String s1 = txt;
			File f1 = new File(fn);
			long sz = f1.length();
			if (sz == 0)
			{
				FileOutputStream fout = new FileOutputStream(f1);
				PrintStream ps = new PrintStream(fout);
				ps.println(s1);
				ps.close();
			}
		}
		catch (IOException ie)
		{
			System.out.println(ie);
		}
	}
	
	public static void main(String[] args)
	{
		WriteString ws = new WriteString("f1.txt", "Hello world");
	}
}