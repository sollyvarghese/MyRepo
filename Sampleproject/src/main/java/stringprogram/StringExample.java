package stringprogram;

public class StringExample {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		String a ="Solly  ";
		System.out.println(a);
		
		String a1 = new String("hii"); 
		System.out.println(a1);
		String a2 = "hello how are you?";
		String a3 = "HELLO";
		
		String a4 ="";
		String a8= "hello";

		
		// length method - to find the length of the string
		System.out.println(a.length());
		//charAt() -- to return the character of the string
		System.out.println(a.charAt(4)); // index needed - to print the character that represeting  position 
		// concat() - to add two strings
		System.out.println(a.concat(a1));
		//contains() -- to check whether a character or word is present in the string
		
		System.out.println(a.contains(a1));
		System.out.println(a.contains("ol")); 
		
		//toUppercase() - to upper case
		System.out.println(a2.toUpperCase());
		// toLowerCase() - to lower case
		System.out.println(a3.toLowerCase());
		//isEmpty() - to check whether a string is empty or not
		System.out.println(a.isEmpty());
		System.out.println(a4.isEmpty());
		String a5= "solly  ";
		String a6= "Solly  ";
		//equals() - to check whether 2 strings are equal or not
		
		System.out.println(a.equals(a5));
		System.out.println(a.equals(a6));
		System.out.println(a.equals(a3));
        // equalsIgnoreCase() - to ignore the case
		System.out.println(a.equalsIgnoreCase(a5));
		//== - 
		System.out.println(a==a6);
		String a7 = new String("hello");
		System.out.println(a8.equals(a7));
		System.out.println(a8==a7);
		// Equal operator is used to compare object reference/location , it doesnot compare the value ,on the other hand equal method compares  the value
		
		String a9 = new String("hello");
		System.out.println(a7==a9);
		System.out.println(a7.equals(a9));
		//ValueOf() - to convert any data type to String
		int a10=7;
		System.out.println(String.valueOf(a10));
		//trim() - it is used to remove leading(first whit space) and trailing(last) white spaces from a string, it does not remove space between words
		String a11 = " How are you? ";
		System.out.println(a11.trim());
        // subString() - to extract a part of the string
		System.out.println(a11.substring(1, 4));
		System.out.println(a11.substring(5));

		
		
		
	}

}
