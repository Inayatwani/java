import java.util.Scanner;

public class NUmOrChar {

    public static void main(String[] args) {
        char c;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter :");
        c = s.next().charAt(0);
        if (c=='~' || c=='!' || c=='@' || c=='#' || c=='%')
            System.out.println("special character");
        else if((c>='A' && c<='Z')||(c>='a' && c<='z'))
            System.out.println("character");
        else
            System.out.println("number ");

        //else
           // System.out.println("wallah hu aalam");
    }
}
