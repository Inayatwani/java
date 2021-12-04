package inayat;
import java.lang.String;
import java.util.*;



public class Nested {

	public static void main(String[] args) {
		
		String option = "";
		
		ArrayList<String> usernameList = new ArrayList<String>();
		ArrayList<String> passwordList = new ArrayList<String>(); 
		Scanner s = new Scanner(System.in);
	    do {
	    	System.out.println("Enter Your  UserName :");
		    usernameList.add(s.nextLine());
		    System.out.println("Enter Your  Password :");
		    passwordList.add(s.nextLine());
		    
		    System.out.println("Do You Want To Store More (yes/no) :");
		    option = s.nextLine();
	    }while(option.equals("yes"));
	    
	    
			for(int i=0;i<usernameList.size();i++) {
				System.out.println(usernameList.get(i)+" : "+passwordList.get(i));
			}
		
  }
}		
