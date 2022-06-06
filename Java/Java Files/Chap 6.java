//======================================================
//
//	Simple Thread class that inherits from Thread class
//	Ron Enz - June 21, 2012
//
//======================================================

class SimpleThread extends Thread {
	
	// Constructor ----------------------------------------------------
    	public SimpleThread(String str) {
		super(str);
    	}
	


	// Required run() method -------------------------------------------
	// This is the code that executes in the 
	//      new thread of control
    	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + " " + getName());
				try {
			sleep((int)(Math.random() * 1000));
			} catch (InterruptedException e) {}
		}
		System.out.println("DONE! " + getName());
    	} //end run() method
	


	//main method to start 2 Threads ------------------------------------
	public static void main (String args[]) {
        	Thread t1 = new SimpleThread("Bill");
		t1.start();
        	Thread t2 = new SimpleThread("Fiji");
		t2.start();
    	} //end main()
	
	
} //end class
 




