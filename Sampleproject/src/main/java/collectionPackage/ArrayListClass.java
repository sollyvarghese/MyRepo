package collectionPackage;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<String> a= new ArrayList<String>();
		
        a.add("Apple");
        a.add("mango");
        a.add("Orange");
        a.add("Strawberry");
        a.add("BlueBerry");
        System.out.println(a);
        
        ArrayList<String> b= new ArrayList<String>();
		
        
        b.add("Sunday");
        b.add("Monday");
        b.add("Tuesday");
        b.add("Wednesday");
        b.add("Saturday");
        System.out.println(b);
        
        //addAll() - to add a new list into the current list
        System.out.println(a.addAll(b));
        System.out.println(a);
        
        //containsAll() - to check one list in  another list
        
        System.out.println(a.containsAll(b));
        
        System.out.println(b.containsAll(a));
        
        Iterator <String>it=a.iterator();
        
        while(it.hasNext()) {
        	
        	System.out.println(it.next());   
        }
        it.remove();
        System.out.println(a);
        
	}

}
