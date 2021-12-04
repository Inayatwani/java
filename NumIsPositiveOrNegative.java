import java.util.Scanner;

public abstract class NumIsPositiveOrNegative {
    public static void main(String[] args) {
      System.out.println("number is zero ");
      int num;
      Scanner s = new Scanner(System.in);
        System.out.println("enter your number ");
        num = s.nextInt();
        if(num>0)
            System.out.println("positive");
        else if (num<0)
            System.out.println("negative");
        if(num==0)
            System.out.println("zero");
    }

}

