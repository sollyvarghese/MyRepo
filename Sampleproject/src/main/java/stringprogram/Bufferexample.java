package stringprogram;

public class Bufferexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer a = new StringBuffer("Hello ");
		System.out.println(a);
		StringBuilder b = new StringBuilder(" Solly");
		System.out.println(b);
		//insert()- to add new string to the current String based on index
		a.insert(6, "World");
		System.out.println(a);
		//append() - to add a new string at the end of the another String
		System.out.println(a.append(b));
		//replace() - to replace a string based on the index position
		System.out.println(a.replace(12, 18, "sojy"));
		//delete()- to delete a word/char from a string based index position 
		System.out.println(a.delete(6, 11));
		//reverse() - to reverse the string
		System.out.println(b.reverse());
		
		

	}

}
