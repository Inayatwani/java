package inayat;

import java.util.Scanner;
import java.lang.String;

public class Names {

	private final static int MAX =10;
	
	public static void main(String[] args) {
		
		int name;
		String[] nNames = new String[MAX];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter No Of Names ");
		name = s.nextInt();
		if(name<=MAX) {
			
			for(int i=1; i<=name; i++) {
				System.out.println("Enter "+i+"th Name");
				nNames[i] = s.nextLine();
			}
			for(int i=1; i<=name; i++) 
				System.out.println(nNames[i]);
			
		}else
			System.out.println("limit exceeds");
		main(nNames);
		
	}

}
