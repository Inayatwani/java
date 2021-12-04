import java.util.Scanner;

public class Alphabet{

    public static void main(String[] args) {
        char c;
        Scanner s = new Scanner(System.in);
        System.out.println("enter some thing  ");
        c = s.next().charAt(0);
        if((c>='A' && c<='Z')||(c>='a' && c<='z'))
            System.out.println(c+" is alphabet");
        else
            System.out.println(c+" is not alphabet");



    }
}
