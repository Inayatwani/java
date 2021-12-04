package inayat;

import java.lang.String;

public class LambdaFunctions {

	public static void main(String[] args) {
		FnInterface s = (int length, int breadth)->{
			return length*breadth;
		};

		System.out.println("Area is: "+s.area(3,5));
	}

}
