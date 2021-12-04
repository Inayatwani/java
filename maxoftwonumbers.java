import java.util.Scanner;

public class maxoftwonumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1,num2;
        System.out.println("enter you number ");
        num1 = s.nextInt();
        System.out.println("enter your second number ");
        num2 = s.nextInt();
        if(num1>num2)
            System.out.println(num1+"is greater");
        else
            System.out.println(num2+" is greater");
    }

}


