import java.util.Scanner;
public class SumAndProductOfDigits {
    public class Digits {

        public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            System.out.println("Sum And Product Of Digits");
            System.out.println("-----------------------");
            System.out.print("Enter Number: ");
            int number = in.nextInt();
            int r, temp, sum=0, p=1;
            temp = number;
            while (temp!=0){
                r = temp % 10;
                sum = sum + r;
                p = p * r;
                temp = temp / 10;
            }
            System.out.println("Sum of digits of Number of'"+number+"is'': "+sum);
            System.out.println("Product of digits of Number of '"+number+"is'': "+p);
        }
    }
}
