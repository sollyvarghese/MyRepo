package collectionPackage;

import java.util.HashSet;
import java.util.Set;

public class SelClass1 {

	public static void main(String[] args) {
		
		Set <String> s = new HashSet<String>();

		s.add("one");
		s.add("two");
		s.add("three");
		s.add("four");
		s.add("one");
		s.add(null);
		s.add(null);
		System.out.println(s);
		
		// add, addAll,contains,containsAll, size, isEmpty,- only these we can do with set
		s.remove(null);//objext base only work , index based will not work 
		System.out.println(s);
		//clear() - to clear entire list
		s.clear();
		System.out.println(s);
		
	}

}
