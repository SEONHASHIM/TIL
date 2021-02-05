package test.exception3;

import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
