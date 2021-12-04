package inayat;

import java.util.Scanner;

public class Matrics {
	
	
	private static final int MAX = 10;
	

	public static void main(String[] args) {
		
		int[][] A = new int[MAX][MAX];
		int[][] B = new int[MAX][MAX];
		int ra,rb,ca,cb;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter No Of Rows Of Ist");
		ra = s.nextInt();
		System.out.println("Enter No Of cols Of Ist");
		ca = s.nextInt();
		System.out.println("Enter No Of Rows Of 2nd");
		rb = s.nextInt();
		System.out.println("Enter No Of cols Of 2nd");
		cb = s.nextInt();
		
		if(ra==ca && rb==cb) {
			System.out.println("addition is possible");
		}else
			System.out.println("Addition is not possible");
		

			


	}

}
