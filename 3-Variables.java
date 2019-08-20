package Examples;

public class Test {

	public static void main(String[] args) {
		int i = 93469; 
		char c = 'a';
		float f = 2.71f;
		double d = 3.1415;
		String s = "This is clearly a string";
		
		System.out.println("Integer: " + i);
		System.out.println("Character: " + c);
		System.out.println("Floating Point: " + f);
		System.out.println("Double: " + d);
		System.out.println("String: " + s);
		
		s += c;
		System.out.println("String after adding the char: " + s);

		s=s.toUpperCase();
		System.out.println("String in uppercase: " + s);
		s=s.toLowerCase();
		System.out.println("String in lowercase: " + s);
		
		String s1 = s.substring(0, s.length()-10);
		
		System.out.println("Substring of given string: "+ s1);
	}

}
