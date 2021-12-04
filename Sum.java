package inayat;

import java.util.Scanner;

public class Sum {

	public static void main(java.lang.String[] args) {
		Scanner s = new Scanner(System.in);
		int x,y,z;
		System.out.print("Enter Two Numbers :");
		x = s.nextInt();
		y = s.nextInt();
		z = x+y;
		System.out.print("The Sum Of "+x+" And " +y+" Is "+z);
	}

}
