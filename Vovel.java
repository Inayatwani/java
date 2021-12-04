import java.util.Scanner;

public class Vovel {

    public static void main(String[] args) {
        char c;
        Scanner s = new Scanner(System.in);
        System.out.println("enter any character ");
        c = s.next().charAt(0);
        if((c=='A'||c=='E'||c=='I'||c=='O'||c=='U') || (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'))
            System.out.println("vovel");
        else
            System.out.println("consonent");

    }
}
