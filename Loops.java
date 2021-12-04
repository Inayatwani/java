package inayat;
import java.lang.String;

public class Loops {

	public static void main(String[] args) {
		//printing 1 to 10 
		
		//using for loop
		System.out.println("Using For Loop");
		for(int i=1; i<=10; i++) {
			System.out.print(i+" ");
		}
		
		//using while loop
		System.out.println("Using While Loop");
		int i=1;
		while(i<=10) {
			System.out.print(i+" ");
			i++;
		}
		
		//using do while
		System.out.println("Using Do While Loop");
		i = 1;
		do {
			System.out.print(i+" ");
			i++;
		}while(i<=10);
		
		//using for each
		System.out.println("Using For Each Loop");
		int[] arr = {1, 2, 3, 4, 5, 6};
		for(int x : arr) {
			System.out.print(x+" ");
		}
		
		//using for loop parts
		System.out.println("Using For Loop Parts");
		int y=1;
		for(; y<=10; ) {
			System.out.print(y+" ");
			y++;
		}
		
		//special cases of for loop
		System.out.println("Special Cases of for loop\n");
		for(;;)
			System.out.println("ECH");

	}

}
