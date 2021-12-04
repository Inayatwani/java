package inayat;

import java.util.Scanner;
import java.lang.String;

public class Ech {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter your roll no :");
		int x = s.nextInt();
		
		try {
			if(validate(x))
				System.out.println("you are valid student");
		} catch (EchException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
		public static boolean validate(int x) throws EchException {
			if(x>=1 && x<=500)
				return true;
			else throw new EchException();
		}
		
}
