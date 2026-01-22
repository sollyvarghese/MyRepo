package collectionPackage;

import java.util.ArrayList;
import java.util.List;

public class CollectionClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> a= new ArrayList<String>();
		System.out.println(a);
		//add() - to add the  elements in the collection
		a.add("Red");
		a.add("Green");
		a.add("Blue");
		a.add("Green");
		a.add("Black");
		a.add("Pink");
		System.out.println(a);
		//indexOf() - to return the index of the particular element
		System.out.println(a.indexOf("Blue"));
		System.out.println(a.indexOf("Green"));
		//if the element are repeated, the indexoff shows the first occurance 
		
		//lastindexOf() -if the element are repeated, the indexoff shows the Lats occurance 
		System.out.println(a.lastIndexOf("Green"));
		// remove() -to remove the elements insdie the collection based on index
		System.out.println(a.remove(3));
		System.out.println(a);
		System.out.println(a.remove("Pink"));
		System.out.println(a);
		
		//contains - to check whether an element is present or not in the collection
		System.out.println(a.contains("Green"));
		System.out.println(a.contains("Orange"));
		
		//isEmpty() - to check whether a collection is empty or not 
		
		if(a.isEmpty()) {
			
			
			System.out.println("List is empty");
		}else {
			System.out.println("List is not empty");
		}
		
		//get() - to retrieve a particular elements from the list basesd on index
		
		System.out.println(a.get(3));
		
		// size() - to find the length of the list 
		System.out.println(a.size());
		
	    // Iterating list using for
		for (int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		// Iteratiing list using for each
		for (String colour:a)
		{
			System.out.println(colour);
		}
		
		

	}

}
