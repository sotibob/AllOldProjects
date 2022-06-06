import java.util.*;
 /*****************************************************************************
  Ron Enz
  Vector with Strings Example
   
 *****************************************************************************/
class VectorExample {

	public VectorExample() {

		Vector<String> v1 = new Vector<String>();

		fillVector(v1);
		printVector(v1);

	} //end constructor

	public void fillVector(Vector<String> v) {

		v.add(new String("Atlanta Braves"));
		v.add(new String("Atlanta Hawks"));
		v.add(new String("Atlanta Falcons"));

	} //end fillVector()

	public void printVector(Vector<String> v) {

		Enumeration<String> e = v.elements();
		while(e.hasMoreElements())  {

			System.out.println(e.nextElement());

		} //end while
		
	} //end printVector()

	public static void main(String args[]) {

		VectorExample ds = new VectorExample();		
	} //end main()
	
} //end class