import java.util.Scanner;
public class PalandromeNumber {
    public class Main
    {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number: ");
            String reverse = "";
            String num = sc.nextLine();
            int length = num.length();
            for ( int i = length - 1; i >= 0; i-- )
                reverse = reverse + num.charAt(i);
            if (num.equals(reverse))
                System.out.println("The entered number " +num +" is a palindrome.");
            else
                System.out.println("The entered number " +num +"  isn't a palindrome.");
        }
    }
}
