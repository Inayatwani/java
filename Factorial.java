package inayat;
import java.util.Scanner;
import java.lang.String;
public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num,fac=1,i;
		System.out.println("Enter the no:");
		num = sc.nextInt();
		for(i=num;i>=1;i--) {
			
			fac=fac*i;
		}
		System.out.println(fac);
		

}

}
