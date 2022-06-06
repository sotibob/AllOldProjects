   import java.util.ArrayList;
/*****************************************************************************
  Ron Enz
  ArrayList with Strings Example
   
 *****************************************************************************/
    public class ArrayListExample {
    
       public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("dog");
		arrList.add("cat");
		arrList.add("lion");
		
		System.out.println("ArrayList OUTPUT ");
		String s1;
		for (int i = 0; i<arrList.size(); i++){
			s1 = arrList.get(i);
			System.out.println("ArrayList["+i+"] = "+s1);
		}
      }
   }