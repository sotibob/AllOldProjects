public class MyThread implements Runnable
{
	int Number = 0;
	
	public MyThread(int num)
	{
		Number = num;
	}
		
	public void run()
	{
		for (int i = 0; i < Number; i++)
		{
			System.out.println("Thread running... " + Number);
		}
		System.out.println("DONE!");
	}
	
	public static void main (String args[])
	{
        MyThread t1 = new MyThread(250);
		Thread m1 = new Thread(t1);
		m1.start();
        MyThread t2 = new MyThread(300);
		Thread m2 = new Thread(t2);
		m2.start();
		MyThread t3 = new MyThread(350);
		Thread m3 = new Thread(t3);
		m3.start();
		MyThread t4 = new MyThread(400);
		Thread m4 = new Thread(t4);
		m4.start();
    }
}	