import java.util.Scanner;

public class Ds1 {
    public static void main(String[] args) {
        int i,j,size=0,elt;
        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[10];
        while (true){
            System.out.println("enter any element  ");
            elt = scanner.nextInt();
            if (size>=10){
                System.out.println(" out of size ");
            }else if (size==0){
                arr[0] = elt;
                size++;
                System.out.println("element has been aded");
            }

        }

    }
}
