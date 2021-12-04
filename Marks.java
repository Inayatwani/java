package inayat;

import java.util.Scanner;
import java.lang.String;

public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int math,english ,urdu,science,kashmiri,total_marks;
		float per;
		System.out.println("Enter The Marks oF Math");
		math = sc.nextInt();
		
		System.out.println("Enter The Marks oF english");
		english = sc.nextInt();
		
		System.out.println("Enter The Marks oF urdu");
		urdu = sc.nextInt();
		
		System.out.println("Enter The Marks oF science");
		science = sc.nextInt();
		
		System.out.println("Enter The Marks oF kashmiri");
		kashmiri = sc.nextInt();
		
		total_marks = math+english+urdu+science+kashmiri;
		
		per = ((float)total_marks/500)*100;
		
		System.out.println("Your Total Marks = : "+total_marks);
		System.out.println("Your Percentage Is :"+per);
		
	

	}

}
