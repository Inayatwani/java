package inayat;
import java.lang.String;
import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num,num2 ,flag=0;
		System.out.println("Enter the number to check is it prime");
		num = s.nextInt();
		num2=num/2;
		for(int i=2;i<=num2;i++) {
			
			if(num%i==0) {
				
				flag=1;
			}
				
		}
		if(flag==1) {
			System.out.println("Prime number");
		}else
			System.out.println("Not Prime number");
		
	
	}

}
