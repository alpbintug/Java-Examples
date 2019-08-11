package Examples;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		System.err.println("Hello World!");
		try {
			System.out.write("Hello World!\n".getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.format("%s", "Hello World!\n");
		
		PrintStream print = new PrintStream(new FileOutputStream(FileDescriptor.out));		
		print.print("Hello World!");
	}

}
