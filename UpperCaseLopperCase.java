import java.util.Scanner;

public class UpperCaseLopperCase {

    public static void main(String[] args) {
        char c;
        Scanner s = new Scanner(System.in);
        System.out.println("enter alphabet :");
        c = s.next().charAt(0);
        if (c>='A' && c<='Z')
            System.out.println("upper case");
        else if (c>='a' && c<='z')
            System.out.println("lopper case ");
        else
            System.out.println("wallah hu alam");
    }
}
