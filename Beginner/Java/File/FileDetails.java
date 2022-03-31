/*******************
*Sotonte Bob-manuel
*Lab #5
********************/

import java.io.*;

public class FileDetails
{
	public FileDetails(String fn)
	{
		File f1 = new File(fn);
		boolean ex = f1.exists();
		System.out.println("File Existence: " + ex);
		boolean cr = f1.canRead();
		System.out.println("File Readable: " + cr);
		boolean cw = f1.canWrite();
		System.out.println("File Writable: " + cw);
		long sz = f1.length();
		System.out.println("File has " + sz + " Chars.");
	}
	
	public static void main(String[] args)
	{
		FileDetails fd = new FileDetails("anyfile.doc");
	}
}