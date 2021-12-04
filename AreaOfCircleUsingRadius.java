import java.util.Scanner;
public class AreaOfCircleUsingRadius {
    public class AreaOfCircle {

        public static void main(String[] args) {
            System.out.print("Enter radius of circle: ");
            Scanner sn = new Scanner(System.in);
            Double radius = sn.nextDouble();

            Double area = Math.PI * radius * radius;
            System.out.println("Area = "+area);
        }
    }
}
