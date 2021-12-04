import java.util.Scanner;

public class NumIsDivisibleByFiveAndEight {
    public static void main(String[] args) {
        int num;
        Scanner s = new Scanner(System.in);
        System.out.println("enter number ");
        num = s.nextInt();
        if (num % 5 == 0 && num % 11 == 0)
            System.out.println("divisible");
        else
            System.out.println("not divisible by 5 and 11");
    }
}